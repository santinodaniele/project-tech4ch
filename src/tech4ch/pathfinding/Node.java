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
	
	public Poi getPoi() {
		return this.poi;
	}
	
	public int compareTo(Node other){
		return Double.compare(shortestDistance, other.shortestDistance);
	}

}
