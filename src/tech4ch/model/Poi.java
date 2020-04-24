package tech4ch.model;

import java.util.HashMap;
import java.util.Set;

public class Poi {

	private String name;
	private int totalVisitors;
	private int totalSeconds;
	private Position position;

	public Poi(String name, int x, int y) {
		this.name = name;
		this.totalVisitors = 0;
		this.totalSeconds = 0;
		this.position = new Position(x, y);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSeconds() {
		return this.totalSeconds;
	}

	public int getTotalVisitors() {
		return totalVisitors;
	}

	public void setTotalVisitors(int totalVisitors) {
		this.totalVisitors = totalVisitors;
	}

	public void setTotalSeconds(int totalSeconds) {
		this.totalSeconds = totalSeconds;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poi other = (Poi) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

	public void countVisitor(Visitor visitor) {
		Set<String> poiSet = visitor.getPoiSet();
		if(poiSet.contains(this.getName())) {
			this.totalVisitors++;
		}
	}

	public void countSeconds(Visitor visitor) {
		HashMap<String, Integer> poi2seconds = visitor.getPoi2seconds();
		if(poi2seconds.containsKey(this.getName())) {
			this.totalSeconds += poi2seconds.get(this.getName());
		}
	}
}
