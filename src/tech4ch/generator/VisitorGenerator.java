package tech4ch.generator;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import tech4ch.model.Poi;
import tech4ch.model.Visitor;


public class VisitorGenerator {

	public static final String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	public static final String mysqlConnectionUrl = "jdbc:mysql://localhost:3306/tech4ch?useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String mysqlUsername = "root";
	public static final String mysqlPassword = "root";
	public static final int usersRetrieved = 300;

	public ArrayList<Visitor> initVisitors() throws SQLException, ClassNotFoundException {
		Class.forName(mysqlDriver);  
		Connection connection = DriverManager.getConnection(mysqlConnectionUrl, mysqlUsername, mysqlPassword);   
		Statement statement = connection.createStatement();
		ArrayList<Visitor> visitorList = new ArrayList<Visitor>();
		int i = 0;
		while(i != usersRetrieved) {
			String query = "select start_time, finish_time, poi_name from position join visitor on "
					+ "position.id_visitor = visitor.id_visitor where position.id_visitor = " + (i+1);
			ResultSet rs = statement.executeQuery(query);
			Visitor visitor = new Visitor(i+1);
			while(rs.next()) {
				createVisitor(visitor, rs.getString(1), rs.getString(2), rs.getString(3));
			}
			visitorList.add(visitor);
			i++;
		}
		connection.close();  
		return visitorList;
	}

	public void createVisitor(Visitor visitor, String startTime, String finishTime, String poiName) {
		int totalSeconds = parseString2Seconds(startTime, finishTime);
		HashMap<String, Integer> poi2seconds = visitor.getPoi2seconds();
		if(poi2seconds.containsKey(poiName)) {
			int updateTime = poi2seconds.get(poiName) + totalSeconds;
			poi2seconds.put(poiName, updateTime);
		}
		else {
			poi2seconds.put(poiName, totalSeconds);
		}
		HashMap<Integer, ArrayList<String>> hour2poi = visitor.getHour2poi();
		int hour = time2Hour(startTime);
		if(hour2poi.containsKey(hour)) {
			hour2poi.get(hour).add(poiName);
		}
		else {
			ArrayList<String> poiList = new ArrayList<String>();
			poiList.add(poiName);
			hour2poi.put(hour, poiList);
		}
	}
	
	public int parseString2Seconds(String time1, String time2) {
		String[] timeFormat1 = time1.split(":");
		String[] timeFormat2 = time2.split(":");
		int totalSeconds = 0;
		int k = 3600;
		for(int i = 0; i < timeFormat1.length; i++) {
			totalSeconds += (Integer.parseInt(timeFormat2[i]) - Integer.parseInt(timeFormat1[i])) * k;
			k = k / 60;
		}
		return totalSeconds;
	}
	
	public int time2Hour(String time) {
		String[] timeFormat = time.split(":");
		return Integer.parseInt(timeFormat[0]);
	}
}
