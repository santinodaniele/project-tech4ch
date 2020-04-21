package tech4ch.pathfinding;


public class Node implements Comparable<Node>{


	public String poiName;
	public Edge[] neighborNodes;
	public double shortestDistance = Double.POSITIVE_INFINITY;
	public Node parent;

	public Node(String poiName){
		this.poiName = poiName;
	}

	public String toString(){
		return poiName;
	}

	public int compareTo(Node other){
		return Double.compare(shortestDistance, other.shortestDistance);
	}

}
