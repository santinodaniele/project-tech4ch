package tech4ch.generator;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import tech4ch.model.Museum;
import tech4ch.model.Poi;
import tech4ch.model.Position;
import tech4ch.model.Presentation;
import tech4ch.model.Visitor;


public class VisitorGenerator {

	public static final String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	public static final String mysqlConnectionUrl = "jdbc:mysql://localhost:3306/dbTech?useLegacyDatetimeCode=false&serverTimezone=UTC";;
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
			String queryPosition = "select start_time, finish_time, poi_name , group_number from position join visitor on "
					+ "position.id_visitor = visitor.id_visitor where position.id_visitor = " + (i+1);
			ResultSet rsPosition = statement.executeQuery(queryPosition);
			Visitor visitor = new Visitor(i+1);
			while(rsPosition.next()) {
				createVisitor(visitor, rsPosition.getString(1), rsPosition.getString(2), rsPosition.getString(3) , rsPosition.getString(4));
			}
			String queryPresentation = "select start_time, finish_time, poi_name , terminatedBy from presentation join visitor on "
					+ "presentation.id_visitor = visitor.id_visitor where presentation.id_visitor = " + (i+1);
			ResultSet rsPresentation = statement.executeQuery(queryPresentation);
			while(rsPresentation.next()) {
				addPresentationToVisitor(visitor, rsPresentation.getString(1), rsPresentation.getString(2), rsPresentation.getString(3), rsPresentation.getString(4));
			}
			visitorList.add(visitor);
			i++;
		}
		connection.close();
		return visitorList;
	}

	public void addPresentationToVisitor(Visitor visitor, String startTime, String finishTime, String poiName, String terminatedBy) {
		Presentation presentation = new Presentation(poiName, terminatedBy);
		int totalSeconds = parseString2Seconds(startTime, finishTime);
		HashMap<Presentation, Integer> presentation2seconds = visitor.getPresentation2seconds();
		if(presentation2seconds.containsKey(presentation)) {
			int updateTime = presentation2seconds.get(presentation) + totalSeconds;
			presentation2seconds.put(presentation, updateTime);
		}
		else {
			presentation2seconds.put(presentation, totalSeconds);
		}
	}
	
	public void createVisitor(Visitor visitor, String startTime, String finishTime, String poiName, String groupNumber) {
		visitor.addPoi(new Poi(poiName, assignPosition(poiName).getX(), assignPosition(poiName).getY()));
		visitor.setGroupId(Integer.parseInt(groupNumber));
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
	
	public HashMap<Integer, ArrayList<Visitor>> createVisitorGroup(ArrayList<Visitor> visitorList) {
		HashMap<Integer, ArrayList<Visitor>> group2Visitors = new HashMap<Integer, ArrayList<Visitor>>();
		for(Visitor v : visitorList) {
			if(group2Visitors.containsKey(v.getGroupId())) {
				group2Visitors.get(v.getGroupId()).add(v);
				group2Visitors.put(v.getGroupId(), group2Visitors.get(v.getGroupId()));
			}
			else {
				ArrayList<Visitor> tmpVisitorList =  new ArrayList<Visitor>();
				tmpVisitorList.add(v);
				group2Visitors.put(v.getGroupId(), tmpVisitorList);
			}
		}
		return group2Visitors;
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
	
	public Position assignPosition(String poiName) {
		Position position = new Position();
		Museum museum = new Museum();
		for(Poi poi : museum.getPoiList()) {
			if(poi.getName().equals(poiName)) {
				position.setX(poi.getPosition().getX());
				position.setY(poi.getPosition().getY());
			}
		}
		return position;
	}
}
