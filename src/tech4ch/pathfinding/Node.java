package tech4ch.pathfinding;

import tech4ch.model.Poi;
import tech4ch.model.Position;

public class Node implements Comparable<Node>{


	public Poi poi;
	public Edge[] neighborNodes;
	public double shortestDistance = Double.POSITIVE_INFINITY;
	public Node parent;

	public Node(Poi poi){
		this.poi = poi;
	}
	
	public Position getNodePosition() {
		return this.poi.getPosition();
	}
	
	public Node getNodeByName(String poiName) {
		if(this.poi.getName().equals(poiName)) return this;
		return null;
	}
	
	public int compareTo(Node other){
		return Double.compare(shortestDistance, other.shortestDistance);
	}

}
