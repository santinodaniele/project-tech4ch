package tech4ch.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Room {
	
	private boolean isVisited;
	private int totalVisitors;
	private int roomNumber;
	private ArrayList<String> poiList;
	private	TreeMap<Integer, Integer> hour2visitor;
	
	public Room(int roomNumber) {
		this.totalVisitors = 0;
		this.isVisited = false;
		this.roomNumber = roomNumber;
		this.poiList = new ArrayList<String>();
		this.hour2visitor = new TreeMap<Integer, Integer>();
	}
	
	public int getTotalVisitor() {
		return this.totalVisitors;
	}
	
	public void setTotalVisitors(int totalVisitors) {
		this.totalVisitors = totalVisitors;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public ArrayList<String> getPoiList() {
		return poiList;
	}

	public void setPoiList(ArrayList<String> poiList) {
		this.poiList = poiList;
	}
	
	public TreeMap<Integer, Integer> getHour2visitor() {
		return hour2visitor;
	}

	public void setHour2visitor(TreeMap<Integer, Integer> hour2visitor) {
		this.hour2visitor = hour2visitor;
	}

	public int getTotalVisitors() {
		return totalVisitors;
	}

	public void addPoi(String poi) {
		this.poiList.add(poi);
	}
	
}
