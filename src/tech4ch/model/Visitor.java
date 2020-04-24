package tech4ch.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class Visitor {

	private int id;
	private int groupId;
	private HashMap<Integer, ArrayList<String>> hour2poi;
	private HashMap<String, Integer> poi2seconds;
	private HashMap<String, Integer> presentation2seconds;
	private ArrayList<Presentation> presentationList;
	private ArrayList<Poi> poiList;

	public Visitor(int id) {
		this.id = id;
		this.groupId = 0;
		this.hour2poi = new HashMap<Integer, ArrayList<String>>();
		this.poi2seconds = new HashMap<String, Integer>();
		this.presentation2seconds = new HashMap<String, Integer>();
		this.presentationList = new ArrayList<Presentation>();
		this.poiList = new ArrayList<Poi>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public HashMap<Integer, ArrayList<String>> getHour2poi() {
		return hour2poi;
	}

	public void setHour2poi(HashMap<Integer, ArrayList<String>> hour2poi) {
		this.hour2poi = hour2poi;
	}

	public HashMap<String, Integer> getPoi2seconds() {
		return poi2seconds;
	}

	public void setPoi2seconds(HashMap<String, Integer> poi2seconds) {
		this.poi2seconds = poi2seconds;
	}

	public HashMap<String, Integer> getPresentation2seconds() {
		return presentation2seconds;
	}

	public void setPresentation2seconds(HashMap<String, Integer> presentation2seconds) {
		this.presentation2seconds = presentation2seconds;
	}

	public ArrayList<Presentation> getPresentationList() {
		return presentationList;
	}

	public void setPresentationList(ArrayList<Presentation> presentationList) {
		this.presentationList = presentationList;
	}

	public ArrayList<Poi> getPoiList() {
		return poiList;
	}

	public void setPoiList(ArrayList<Poi> poiList) {
		this.poiList = poiList;
	}

	public Set<String> getPoiSet(){
		return this.poi2seconds.keySet();
	}

	public void addPresentation(Presentation presentation) {
		this.presentationList.add(presentation);
	}

	public void addPoi(Poi poi) {
		this.poiList.add(poi);
	}

}
