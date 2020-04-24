package tech4ch.generator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;
	
import tech4ch.model.Museum;
import tech4ch.model.Poi;
import tech4ch.model.Position;
import tech4ch.model.Room;
import tech4ch.model.Visitor;
import tech4ch.pathfinding.Node;
import tech4ch.pathfinding.VisitorPath;
import tech4ch.stats.MuseumStats;
import tech4ch.stats.VisitorStats;

public class MuseumGenerator {
	private static Museum museum;
	private static RoomGenerator roomGen;
	private static VisitorGenerator visitorGen;
	private static PoiGenerator poiGen;
	private static MuseumStats museumStats;
	private static VisitorStats visitorStats;
	private static GraphGenerator graphGen;
	private static VisitorPath visitorPath;
	
	
	public MuseumGenerator() {
		MuseumGenerator.museum = new Museum();
		MuseumGenerator.roomGen = new RoomGenerator();
		MuseumGenerator.visitorGen = new VisitorGenerator();
		MuseumGenerator.poiGen = new PoiGenerator();
		MuseumGenerator.museumStats = new MuseumStats();
		MuseumGenerator.visitorStats = new VisitorStats();
		MuseumGenerator.graphGen = new GraphGenerator();
		MuseumGenerator.visitorPath = new VisitorPath();
		
	}

	public static void initMuseum() throws ClassNotFoundException, SQLException {
		museum.setRoomList(roomGen.initRooms());	
		museum.setVisitorList(visitorGen.initVisitors());
		museum.setPoiList(poiGen.initPois());
		museum.setMuseumGraph(graphGen.initGraph());
		visitorGen.initPresentations(museum.getVisitorList());
		visitorStats.averagePresentationTime(museum.getVisitorList());
		visitorStats.averagePresentationNumber(museum.getVisitorList());
	}
	
	public static ArrayList<Poi> museumGetPoiStats(){
		return museumStats.getPoiStats(museum.getVisitorList(), museum.getPoiList());
	}
	
	public static ArrayList<Poi> museumGetHoldingPowerStats(){
		return museumStats.getBestHoldingPowerPoi(museum.getVisitorList(), museum.getPoiList());
	}
	
	public static ArrayList<Room> museumGetVisitorsPerRoom(){
		museumStats.getVisitorsPerRoomsPerAllHours(museum.getVisitorList(), museum.getRoomList());
		return museum.getRoomList();
	}
	
	public static ArrayList<Poi> museumGetAttractionPowerStats(){
		return museumStats.getBestAttractionPowerPoi(museum.getVisitorList(), museum.getPoiList());
	}
	
	public static TreeMap<Integer, Integer> museumGetVisitorPerAllHours(){
		return museumStats.getVisitorPerAllHours(museum.getVisitorList());
	}
	
	public static Museum getMuseum() {
		return museum;
	}
	
	public static ArrayList<Node> museumGetVisitorPath(Visitor visitor){
		return visitorPath.getVisitorPath(visitor, museum.getMuseumGraph());
	}
	
}
