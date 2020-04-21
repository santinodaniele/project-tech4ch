package tech4ch.pathfinding;

import java.util.List;

public class TestDijkstra {

	public static void main(String[] args) {

		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");

		a.neighborNodes = new Edge[]{
				new Edge(b,1),
				new Edge(c,1)
		};

		b.neighborNodes = new Edge[]{
				new Edge(a,1),
				new Edge(c,1),
				new Edge(d,1)
		};

		c.neighborNodes = new Edge[]{
				new Edge(a,1),
				new Edge(b,1),
				new Edge(e,1)
		};

		d.neighborNodes = new Edge[]{
				new Edge(b,1),
				new Edge(e,1)
		};

		e.neighborNodes = new Edge[]{
				new Edge(c,1),
				new Edge(d,1)
		};
		
		Node[] nodes = {a,b,c,d,e};
		dijkstra.computePaths(a);
		List<Node> path = dijkstra.getShortestPathTo(e);
		System.out.println("Path: " + path);
	}

}
