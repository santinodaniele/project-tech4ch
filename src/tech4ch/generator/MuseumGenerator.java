package tech4ch.generator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeMap;

import tech4ch.generator.PoiGenerator;
import tech4ch.generator.RoomGenerator;
import tech4ch.generator.VisitorGenerator;
import tech4ch.model.Museum;
import tech4ch.model.Poi;
import tech4ch.model.Room;
import tech4ch.stats.MuseumStats;

public class MuseumGenerator {
	private static Museum museum;
	private static RoomGenerator roomGen;
	private static VisitorGenerator visitorGen;
	private static PoiGenerator poiGen;
	private static MuseumStats museumStats;
	
	public MuseumGenerator() {
		MuseumGenerator.museum = new Museum();
		MuseumGenerator.roomGen = new RoomGenerator();
		MuseumGenerator.visitorGen = new VisitorGenerator();
		MuseumGenerator.poiGen = new PoiGenerator();
		MuseumGenerator.museumStats = new MuseumStats();
	}

	public static void initMuseum() throws ClassNotFoundException, SQLException {
		museum.setRoomList(roomGen.initRooms());
		museum.setVisitorList(visitorGen.initVisitors());
		museum.setPoiList(poiGen.initPois());
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
	
}
