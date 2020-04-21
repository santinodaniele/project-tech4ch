package tech4ch.pathfinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

	public void computePaths(Node source){
		source.shortestDistance=0;
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		queue.add(source);
		while(!queue.isEmpty()){
			Node u = queue.poll();
			for(Edge e: u.neighborNodes){
				Node v = e.target;
				double weight = e.weight;
				double distanceFromU = u.shortestDistance+weight;
				if(distanceFromU<v.shortestDistance){
					queue.remove(v);
					v.shortestDistance = distanceFromU;
					v.parent = u;
					queue.add(v);

				}
			}
		}
	}
	
	public List<Node> getShortestPathTo(Node target){
		List<Node> path = new ArrayList<Node>();
		for(Node node = target; node!=null; node = node.parent){
			path.add(node);
		}
		Collections.reverse(path);
		return path;
	}

}
