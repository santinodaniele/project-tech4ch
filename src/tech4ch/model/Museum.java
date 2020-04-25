package tech4ch.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Museum {

	private ArrayList<Poi> poiList;
	private ArrayList<Room> roomList;
	private ArrayList<Visitor> visitorList;
	private ArrayList<Presentation> presentationList;
	private HashMap<Integer, ArrayList<Visitor>> group2Visitors;

	public Museum() {
		this.poiList = new ArrayList<Poi>();
		this.roomList = new ArrayList<Room>();
		this.visitorList = new ArrayList<Visitor>();
		this.presentationList = new ArrayList<Presentation>();
		this.group2Visitors = new HashMap<Integer, ArrayList<Visitor>>();
	}

	public ArrayList<Poi> getPoiList() {
		return this.poiList;
	}

	public void setPoiList(ArrayList<Poi> poiList) {
		this.poiList = poiList;
	}

	public ArrayList<Room> getRoomList() {
		return this.roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}

	public ArrayList<Visitor> getVisitorList() {
		return this.visitorList;
	}

	public void setVisitorList(ArrayList<Visitor> visitorList) {
		this.visitorList = visitorList;
	}

	public ArrayList<Presentation> getPresentationList() {
		return this.presentationList;
	}

	public void setPresentationList(ArrayList<Presentation> presentationList) {
		this.presentationList = presentationList;
	}

	public HashMap<Integer, ArrayList<Visitor>> getGroup2Visitor() {
		return this.group2Visitors;
	}

	public void setGroup2Visitor(HashMap<Integer, ArrayList<Visitor>> group2Visitor) {
		this.group2Visitors = group2Visitor;
	}
}
