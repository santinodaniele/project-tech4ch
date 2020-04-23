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
	
	public static ArrayList<Node> createGraph(){
		Poi startingPoint = new Poi("StartingPoint", 761, 466);
		Node start = new Node(startingPoint);

		/*Room 1*/
		Poi room1PathPoint1 = new Poi("Room1PathPoint1", 613, 459);
		Poi room1PathPoint2 = new Poi("Room1PathPoint2", 496, 454);

		Node nodeRoom1PathPoint1 = new Node(room1PathPoint1);
		Node nodeRoom1PathPoint2 = new Node(room1PathPoint2);

		Node node4 = new Node(new Poi("SymbolsJewishMenorah", 654, 480));
		Node node41 = new Node(new Poi("PersianCult", 585, 481));
		Node node74 = new Node(new Poi("JerusalemPhoto", 501, 486));
		Node node51 = new Node(new Poi("EntranceReubenHecht", 714, 438));

		/*Room 4*/
		Poi room4PathPoint1 = new Poi("Room4PathPoint1", 496, 312);
		Poi room4PathPoint2 = new Poi("Room4PathPoint2", 417, 305);
		Poi room4PathPoint3 = new Poi("Room4PathPoint3", 415, 408);
		Poi room4PathPoint4 = new Poi("Room4PathPoint4", 362, 378);
		Poi room4PathPoint5 = new Poi("Room4PathPoint5", 332, 386);
		Poi room4PathPoint6 = new Poi("Room4PathPoint6", 298, 372);

		Node nodeRoom4PathPoint1 = new Node(room4PathPoint1);
		Node nodeRoom4PathPoint2 = new Node(room4PathPoint2);
		Node nodeRoom4PathPoint3 = new Node(room4PathPoint3);
		Node nodeRoom4PathPoint4 = new Node(room4PathPoint4);
		Node nodeRoom4PathPoint5 = new Node(room4PathPoint5);
		Node nodeRoom4PathPoint6 = new Node(room4PathPoint6);

		Node node59 = new Node(new Poi("Phoenicians", 453,315));
		Node node54 = new Node(new Poi("ImportedPottery", 379, 406));
		Node node38 = new Node(new Poi("CraftsAndArts", 390, 370));
		Node node37 = new Node(new Poi("MaritimeCommerce", 334, 403));
		Node node34 = new Node(new Poi("BuildingMethodsAndFacilities", 342, 371));
		Node node65 = new Node(new Poi("ReligionAndCult", 354, 334));
		Node node36 = new Node(new Poi("BurialTradition2", 283, 398));
		Node node20 = new Node(new Poi("PhoenicianWriting1", 290, 358));
		Node node66 = new Node(new Poi("EverydayPottery", 316, 336));

		/*Room 3*/
		Poi room3PathPoint1 = new Poi("Room3PathPoint1", 457, 292);
		Poi room3PathPoint2 = new Poi("Room3PathPoint2", 456, 266);
		Poi room3PathPoint3 = new Poi("Room3PathPoint3", 271, 267);
		Poi room3PathPoint4 = new Poi("Room3PathPoint4", 431, 192);
		Poi room3PathPoint5 = new Poi("Room3PathPoint5", 274, 192);
		Poi room3PathPoint6 = new Poi("Room3PathPoint6", 324, 107);

		Node nodeRoom3PathPoint1 = new Node(room3PathPoint1);
		Node nodeRoom3PathPoint2 = new Node(room3PathPoint2);
		Node nodeRoom3PathPoint3 = new Node(room3PathPoint3);
		Node nodeRoom3PathPoint4 = new Node(room3PathPoint4);
		Node nodeRoom3PathPoint5 = new Node(room3PathPoint5);
		Node nodeRoom3PathPoint6 = new Node(room3PathPoint6);

		Node node32 = new Node(new Poi("WoodenTools", 272, 293));
		Node node52 = new Node(new Poi("StoneVesselsBowl",390, 277));
		Node node58 = new Node(new Poi("MosaicfromSynagogue", 430, 258));
		Node node45 = new Node(new Poi("BronzeTools", 456, 183));
		Node node55 = new Node(new Poi("GlassOvenVessels", 373, 159));
		Node node78 = new Node(new Poi("StairsToBathroom", 356, 45));

		/*Room 5*/
		Poi room5PathPoint1 = new Poi("Room5PathPoint1", 182, 186);
		Poi room5PathPoint2 = new Poi("Room5PathPoint2", 36, 181);

		Node nodeRoom5PathPoint1 = new Node(room5PathPoint1);
		Node nodeRoom5PathPoint2 = new Node(room5PathPoint2);

		Node node18 = new Node(new Poi("ShipEntrance", 230, 145));
		Node node50 = new Node(new Poi("ShipFront", 178, 148));
		Node node33 = new Node(new Poi("ShipBack", 132, 106));
		Node node46 = new Node(new Poi("MaritimeArcheology", 23, 181));
		Node node21 = new Node(new Poi("Pottery", 23, 139));
		Node node44 = new Node(new Poi("CarpenterTools", 23, 76));

		/*Room 2*/
		Poi room2PathPoint1 = new Poi("Room2PathPoint1", 541, 66);
		Poi room2PathPoint2 = new Poi("Room2PathPoint2", 663, 109);

		Node nodeRoom2PathPoint1 = new Node(room2PathPoint1);
		Node nodeRoom2PathPoint2 = new Node(room2PathPoint2);

		Node node62 = new Node(new Poi("EntranceGallileeRebellion", 489, 124));
		Node node47 = new Node(new Poi("DuckBoxIvories", 542, 90));
		Node node72 = new Node(new Poi("CanaaniteStelae", 543, 53));
		Node node60 = new Node(new Poi("IvoryWomanPhoenician", 636, 75));
		Node node64 = new Node(new Poi("ClayAmphorae", 670, 91));
		Node node5 = new Node(new Poi("AnimalModels", 620, 186));
		Node node100 = new Node(new Poi("Elevator1", 501, 57));
		Node node101 = new Node(new Poi("MuseumMotto", 506,213));
		
		/*Room 7*/
		Poi room7PathPoint1 = new Poi("Room7PathPoint1", 664, 291);
		Poi room7PathPoint2 = new Poi("Room7PathPoint2", 515, 248);
		Poi room7PathPoint3 = new Poi("Room7PathPoint3", 656, 376);
		Poi room7PathPoint4 = new Poi("Room7PathPoint4", 592, 390);
		
		Node nodeRoom7PathPoint1 = new Node(room7PathPoint1);
		Node nodeRoom7PathPoint2 = new Node(room7PathPoint2);
		Node nodeRoom7PathPoint3 = new Node(room7PathPoint3);
		Node nodeRoom7PathPoint4 = new Node(room7PathPoint4);
		
		Node node63 = new Node(new Poi("ChalcolitePeriod", 537, 291));
		Node node39 = new Node(new Poi("LeadCoffinMosaics", 603, 298));
		Node node49 = new Node(new Poi("MaterialCultures", 668, 307));
		Node node40 = new Node(new Poi("JewishCoffins", 585, 337));
		Node node56 = new Node(new Poi("Anthropoids", 548, 388));
		Node node16 = new Node(new Poi("DecoratedDoors", 529, 419));
		Node node53 = new Node(new Poi("MenorahJewishEpigraphy", 606, 415));
		Node node2 = new Node(new Poi("RomanDivinitiesStatuettes", 668, 407));
		
		/*Room 6*/
		Poi room6PathPoint1 = new Poi("Room6PathPoint1", 791, 68);
		Poi room6PathPoint2 = new Poi("Room6PathPoint2", 792, 238);
		Poi room6PathPoint3 = new Poi("Room6PathPoint3", 851, 155);
		Poi room6PathPoint4 = new Poi("Room6PathPoint4", 982, 235);	
		Poi room6PathPoint5 = new Poi("Room6PathPoint5", 964, 111);
		
		Node nodeRoom6PathPoint1 = new Node(room6PathPoint1);
		Node nodeRoom6PathPoint2 = new Node(room6PathPoint2);
		Node nodeRoom6PathPoint3 = new Node(room6PathPoint3);
		Node nodeRoom6PathPoint4 = new Node(room6PathPoint4);
		Node nodeRoom6PathPoint5 = new Node(room6PathPoint5);
		
		Node node76 = new Node(new Poi("Elevator2", 781, 39));
		Node node6 = new Node(new Poi("Gems", 853, 49));
		Node node8 = new Node(new Poi("Weights", 795, 137));
		Node node57 = new Node(new Poi("TempleMount", 843, 117));
		Node node70 = new Node(new Poi("Cyprus", 952, 88));
		Node node48 = new Node(new Poi("Jerusalem", 905, 147));
		Node node61 = new Node(new Poi("GreeceEgypt", 975, 133));
		Node node71 = new Node(new Poi("SevenSpecies", 839, 226));
		Node node67 = new Node(new Poi("Coins", 769, 247));
		Node node68 = new Node(new Poi("OilLamps", 961, 233));
		Node node3 = new Node(new Poi("UpperFloorEntrance", 958, 285));


		/*Room 1 sub graph*/
		start.neighborNodes = new Edge[]{
				new Edge(node51,1),
				new Edge(node4,1),
				new Edge(nodeRoom1PathPoint1,1)
		};

		node51.neighborNodes = new Edge[]{
				new Edge(start,1)
		};

		node4.neighborNodes = new Edge[]{
				new Edge(start,1),
				new Edge(nodeRoom1PathPoint1,1)
		};

		nodeRoom1PathPoint1.neighborNodes = new Edge[]{
				new Edge(node4,1),
				new Edge(node41,1),
				new Edge(nodeRoom1PathPoint2,1),
				new Edge(start,1)

		};

		node41.neighborNodes = new Edge[]{
				new Edge(nodeRoom1PathPoint1,1)
		};

		nodeRoom1PathPoint2.neighborNodes = new Edge[]{
				new Edge(nodeRoom1PathPoint1,1),
				new Edge(node74,1),
				new Edge(nodeRoom4PathPoint1,1)
		};

		node74.neighborNodes = new Edge[]{
				new Edge(nodeRoom1PathPoint2,1)
		};

		/*Room 4 sub graph*/
		nodeRoom4PathPoint1.neighborNodes = new Edge[]{
				new Edge(nodeRoom1PathPoint2,1),
				new Edge(nodeRoom4PathPoint2,1),
				new Edge(node59,1),
				new Edge(node101,1),
				new Edge(nodeRoom7PathPoint2,1)
		};

		node59.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint1,1),
				new Edge(nodeRoom4PathPoint2,1),
		};

		nodeRoom4PathPoint2.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint1,1),
				new Edge(nodeRoom4PathPoint3,1),
				new Edge(node59,1),
				new Edge(node32,1),
				new Edge(nodeRoom3PathPoint1,1)
		};

		nodeRoom4PathPoint3.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint2,1),
				new Edge(nodeRoom4PathPoint4,1),
				new Edge(node54,1)
		};

		node54.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint3,1)
		};

		nodeRoom4PathPoint4.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint3,1),
				new Edge(node38,1),
				new Edge(node65,1),
				new Edge(node34,1),
				new Edge(node37,1),
				new Edge(nodeRoom4PathPoint5,1)
		};

		node38.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint4,1)
		};

		node65.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint4,1)
		};

		node34.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint4,1)
		};

		node37.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint4,1)
		};

		nodeRoom4PathPoint5.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint4,1),
				new Edge(nodeRoom4PathPoint6,1)
		};

		nodeRoom4PathPoint6.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint5,1),
				new Edge(node66,1),
				new Edge(node20,1),
				new Edge(node36,1)
		};

		node66.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint6,1)
		};

		node20.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint6,1)
		};

		node36.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint6,1)
		};

		/*Room 3 sub graph*/
		node32.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint2,1),
				new Edge(nodeRoom3PathPoint3,1)
		};

		nodeRoom3PathPoint1.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint2,1),
				new Edge(nodeRoom3PathPoint2,1)
		};

		nodeRoom3PathPoint3.neighborNodes = new Edge[]{
				new Edge(node32,1),
				new Edge(node52,1)
		};

		node52.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint2,1),
				new Edge(nodeRoom3PathPoint3,1)
		};

		nodeRoom3PathPoint2.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint1,1),
				new Edge(node52,1),
				new Edge(node58,1),
				new Edge(node45,1)
		};

		node58.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint2,1)
		};

		node45.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint2,1),
				new Edge(nodeRoom3PathPoint4,1)
		};

		nodeRoom3PathPoint4.neighborNodes = new Edge[]{
				new Edge(node45,1),
				new Edge(nodeRoom3PathPoint5,1)
		};

		nodeRoom3PathPoint5.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint6,1),
				new Edge(nodeRoom3PathPoint4,1)
		};

		nodeRoom3PathPoint6.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint5,1),
				new Edge(node55,1),
				new Edge(node78,1),
				new Edge(node18,1),
				new Edge(node62,1)
		};

		node78.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint6,1)
		};

		node55.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint6,1)
		};

		/*Room 5 sub graph*/
		node18.neighborNodes = new Edge[]{
				new Edge(nodeRoom3PathPoint6,1),
				new Edge(node50, 1)
		};

		node50.neighborNodes = new Edge[]{
				new Edge(nodeRoom5PathPoint1,1),
				new Edge(node18, 1),
				new Edge(node33, 1)
		};

		node33.neighborNodes = new Edge[]{
				new Edge(node50, 1)
		};

		nodeRoom5PathPoint1.neighborNodes = new Edge[]{
				new Edge(node50, 1),
				new Edge(nodeRoom5PathPoint2, 1)
		};

		nodeRoom5PathPoint2.neighborNodes = new Edge[]{
				new Edge(node46, 1),
				new Edge(node21, 1),
				new Edge(node44, 1),
				new Edge(nodeRoom5PathPoint1, 1)
		};

		node46.neighborNodes = new Edge[]{
				new Edge(nodeRoom5PathPoint2, 1)
		};

		node21.neighborNodes = new Edge[]{
				new Edge(nodeRoom5PathPoint2, 1)
		};

		node44.neighborNodes = new Edge[]{
				new Edge(nodeRoom5PathPoint2, 1)
		};

		/*Room 2 sub graph*/
		node62.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom3PathPoint6, 1), 
				new Edge(nodeRoom2PathPoint1, 1), 
				new Edge(node101, 1), 
				new Edge(node100, 1) 
		};

		nodeRoom2PathPoint1.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom2PathPoint2,1), 
				new Edge(node62, 1), 
				new Edge(node100, 1), 
				new Edge(node47, 1), 
				new Edge(node72, 1),
				new Edge(node60, 1), 
				new Edge(node64, 1) 
		};

		node100.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom2PathPoint1, 1), 
				new Edge(node62, 1),
				new Edge(node76, 1)
		};
		
		node101.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom4PathPoint1, 1), 
				new Edge(node62, 1) 
		};

		node47.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom2PathPoint1, 1) 
		};

		node72.neighborNodes = new Edge[]{
				new Edge(nodeRoom2PathPoint1, 1) 
		};

		node60.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom2PathPoint1, 1) 
		};

		node64.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom2PathPoint1, 1) 
		};

		nodeRoom2PathPoint2.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom2PathPoint1, 1), 
				new Edge(node5, 1) ,
				new Edge(nodeRoom7PathPoint1,1),
		};

		node5.neighborNodes = new Edge[]{ 
				new Edge(nodeRoom2PathPoint2, 1) 
		};

		/*Room 7 sub graph*/
		nodeRoom7PathPoint2.neighborNodes = new Edge[]{
				new Edge(nodeRoom4PathPoint1, 1),
				new Edge(nodeRoom7PathPoint1, 1)
		};
		
		nodeRoom7PathPoint1.neighborNodes = new Edge[]{
				new Edge(nodeRoom2PathPoint2, 1),
				new Edge(nodeRoom7PathPoint2, 1),
				new Edge(nodeRoom7PathPoint3, 1),
				new Edge(node49, 1),
				new Edge(node39, 1),
				new Edge(node63, 1)
		};
		
		nodeRoom7PathPoint3.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint1, 1),
				new Edge(nodeRoom7PathPoint4, 1),
				new Edge(node2, 1)
		};
		
		node2.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint3, 1)
		};
		
		nodeRoom7PathPoint4.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint3, 1),
				new Edge(node53, 1),
				new Edge(node40, 1),
				new Edge(node56, 1),
				new Edge(node16, 1)
		};
		
		node53.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint4, 1)
		};
		
		node56.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint4, 1)
		};
		
		node40.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint4, 1)
		};
		
		node16.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint4, 1)
		};
		
		node63.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint1, 1)
		};
		
		node39.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint1, 1)
		};
		
		node49.neighborNodes = new Edge[]{
				new Edge(nodeRoom7PathPoint1, 1)
		};
		
		/*Room 6 sub graph*/
		node76.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint1, 1),
				new Edge(node100, 1)
		};
		
		nodeRoom6PathPoint1.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint2, 1),
				new Edge(nodeRoom6PathPoint5, 1),
				new Edge(node76, 1),
				new Edge(node6, 1),
				new Edge(node8, 1)
		};
		
		node6.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint1, 1)
		};
		
		node8.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint1, 1)
		};
		
		nodeRoom6PathPoint2.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint1, 1),
				new Edge(nodeRoom6PathPoint3, 1),
				new Edge(node67, 1),
				new Edge(node71, 1)
		};
		
		node67.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint2, 1)
		};
		
		node71.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint2, 1)
		};
		
		nodeRoom6PathPoint3.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint2, 1),
				new Edge(nodeRoom6PathPoint4, 1),
				new Edge(nodeRoom6PathPoint5, 1),
				new Edge(node57, 1),
				new Edge(node48, 1)
		};
		
		node48.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint3, 1)
		};
		
		node57.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint3, 1)
		};
		
		nodeRoom6PathPoint4.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint3, 1),
				new Edge(nodeRoom6PathPoint5, 1),
				new Edge(node68, 1),
				new Edge(node3, 1)
		};
		
		node68.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint4, 1)
		};
		
		node3.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint4, 1)
		};
		
		nodeRoom6PathPoint5.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint3, 1),
				new Edge(nodeRoom6PathPoint4, 1),
				new Edge(node61, 1),
				new Edge(node70, 1)
		};
		
		node61.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint5, 1)
		};
		
		node70.neighborNodes = new Edge[]{
				new Edge(nodeRoom6PathPoint5, 1)
		};
		
		ArrayList<Node> graph = new ArrayList<Node>();
		graph.add(start);
		graph.add(nodeRoom1PathPoint1);
		graph.add(nodeRoom1PathPoint2);
		graph.add(node4);
		graph.add(node41);
		graph.add(node74);
		graph.add(node51);
		graph.add(nodeRoom4PathPoint1);
		graph.add(nodeRoom4PathPoint2);
		graph.add(nodeRoom4PathPoint3);
		graph.add(nodeRoom4PathPoint4);
		graph.add(nodeRoom4PathPoint5);
		graph.add(nodeRoom4PathPoint6);
		graph.add(node59);
		graph.add(node54);
		graph.add(node38);
		graph.add(node37);
		graph.add(node34);
		graph.add(node65);
		graph.add(node36);
		graph.add(node20);
		graph.add(node66);
		graph.add(nodeRoom3PathPoint1);
		graph.add(nodeRoom3PathPoint2);
		graph.add(nodeRoom3PathPoint3);
		graph.add(nodeRoom3PathPoint4);
		graph.add(nodeRoom3PathPoint5);
		graph.add(nodeRoom3PathPoint6);
		graph.add(node32);
		graph.add(node52);
		graph.add(node58);
		graph.add(node45);
		graph.add(node55);
		graph.add(node78);
		graph.add(nodeRoom5PathPoint1);
		graph.add(nodeRoom5PathPoint2);
		graph.add(node18);
		graph.add(node50);
		graph.add(node33);
		graph.add(node46);
		graph.add(node21);
		graph.add(node44);
		graph.add(nodeRoom2PathPoint1);
		graph.add(nodeRoom2PathPoint2);
		graph.add(node62);
		graph.add(node47);
		graph.add(node72);
		graph.add(node60);
		graph.add(node64);
		graph.add(node5);
		graph.add(node100);
		graph.add(node101);
		graph.add(nodeRoom7PathPoint1);
		graph.add(nodeRoom7PathPoint2);
		graph.add(nodeRoom7PathPoint3);
		graph.add(nodeRoom7PathPoint4);
		graph.add(node63);
		graph.add(node39);
		graph.add(node49);
		graph.add(node40);
		graph.add(node56);
		graph.add(node16);
		graph.add(node53);
		graph.add(node2);
		graph.add(nodeRoom6PathPoint1);
		graph.add(nodeRoom6PathPoint2);
		graph.add(nodeRoom6PathPoint3);
		graph.add(nodeRoom6PathPoint4);
		graph.add(nodeRoom6PathPoint5);
		graph.add(node76);
		graph.add(node6);
		graph.add(node8);
		graph.add(node57);
		graph.add(node70);
		graph.add(node48);
		graph.add(node61);
		graph.add(node71);
		graph.add(node67);
		graph.add(node68);
		graph.add(node3);
		return graph;
	}
	
	public ArrayList<Node> getVisitorPath(Visitor visitor){
		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
		ArrayList<Poi> poiList = visitor.getPoiList();
		poiList.add(null);
		ArrayList<Node> path = new ArrayList<Node>();
		for(int i = 0; i < poiList.size(); i++) {
			ArrayList<Node> graph = createGraph();
			Node startNode =  getGraphNode(poiList.get(i), graph);
			dijkstra.computePaths(startNode);
			if(poiList.get(i+1) == null) {
				break;
			}
			else {
				Node targetNode =  getGraphNode(poiList.get(i+1), graph);
				List<Node> subPath = dijkstra.getShortestPathTo(targetNode);
				path.addAll(subPath);
			}
		}
		return path;
	}

}
