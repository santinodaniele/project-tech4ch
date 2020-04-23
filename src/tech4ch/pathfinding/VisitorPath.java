package tech4ch.pathfinding;

import java.util.ArrayList;
import java.util.List;

import tech4ch.model.Poi;
import tech4ch.model.Visitor;

public class VisitorPath{
	
	public static Node getGraphNode(Poi poi, ArrayList<Node> graph) {
		for(Node node : graph) {
			if(node.getPoi().getName().equals(poi.getName())) {
				return node;
			}
		}
		return null;
	}
	
	public ArrayList<Node> getVisitorPath(Visitor visitor, ArrayList<Node> graph){
		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
		ArrayList<Poi> poiList = visitor.getPoiList();
		poiList.add(null);
		ArrayList<Node> path = new ArrayList<Node>();
		for(int i = 0; i < poiList.size(); i++) {
			ArrayList<Node> tmpGraph = graph;
			Node startNode =  getGraphNode(poiList.get(i), tmpGraph);
			System.out.println(startNode);
			dijkstra.computePaths(startNode);
			if(poiList.get(i+1) == null) {
				break;
			}
			else {
				Node targetNode =  getGraphNode(poiList.get(i+1), tmpGraph);
				List<Node> subPath = dijkstra.getShortestPathTo(targetNode);
				path.addAll(subPath);
			}
		}
		System.out.println(path);
		return path;
	}

}
