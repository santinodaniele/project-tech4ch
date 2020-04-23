package tech4ch.model;

import java.util.ArrayList;

import tech4ch.pathfinding.Node;

public class Museum {

	private ArrayList<Poi> poiList;
	private ArrayList<Room> roomList;
	private ArrayList<Visitor> visitorList;
	private ArrayList<Node> museumGraph;

	public Museum() {
		this.poiList = new ArrayList<Poi>();
		this.roomList = new ArrayList<Room>();
		this.visitorList = new ArrayList<Visitor>();
		this.museumGraph = new ArrayList<Node>();
	}
	
	public ArrayList<Poi> getPoiList() {
		return poiList;
	}

	public void setPoiList(ArrayList<Poi> poiList) {
		this.poiList = poiList;
	}

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}

	public ArrayList<Visitor> getVisitorList() {
		return visitorList;
	}

	public void setVisitorList(ArrayList<Visitor> visitorList) {
		this.visitorList = visitorList;
	}

	public ArrayList<Node> getMuseumGraph() {
		return museumGraph;
	}

	public void setMuseumGraph(ArrayList<Node> museumGraph) {
		this.museumGraph = museumGraph;
	}
	
}
