package tech4ch.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Visitor {
	
	private int id;
	private HashMap<Integer, ArrayList<String>> hour2poi;
	private HashMap<String, Integer> poi2seconds; 
	
	public Visitor(int id) {
		this.id = id;
		this.hour2poi = new HashMap<Integer, ArrayList<String>>();
		this.poi2seconds = new HashMap<String, Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Set<String> getPoiList(){
		return this.poi2seconds.keySet();
	}
	
}
