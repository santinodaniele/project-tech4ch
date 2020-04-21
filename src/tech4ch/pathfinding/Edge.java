package tech4ch.pathfinding;

public class Edge {

	public final Node target;
	public final double weight;
	
	public Edge(Node targetNode, double weightVal){
		target = targetNode;
		weight = weightVal;
	}
}
