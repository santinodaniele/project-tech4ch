package tech4ch.pathfinding;

import java.util.List;

import tech4ch.model.Poi;

public class TestDijkstra {



	public static void main(String[] args) {

		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();

		Poi startingPoint = new Poi("StartingPoint", 761, 466);
		Node start = new Node(startingPoint.getName());

		/*Room 1*/
		Poi room1PathPoint1 = new Poi("Room1PathPoint1", 613, 459);
		Poi room1PathPoint2 = new Poi("Room1PathPoint2", 496, 454);

		Node nodeRoom1PathPoint1 = new Node(room1PathPoint1.getName());
		Node nodeRoom1PathPoint2 = new Node(room1PathPoint2.getName());

		Node node4 = new Node("SymbolsJewishMenorah");
		Node node41 = new Node("PersianCult");
		Node node74 = new Node("JerusalemPhoto");
		Node node51 = new Node("EntranceReubenHecht");

		/*Room 4*/
		Poi room4PathPoint1 = new Poi("Room4PathPoint1", 496, 312);
		Poi room4PathPoint2 = new Poi("Room4PathPoint2", 417, 305);
		Poi room4PathPoint3 = new Poi("Room4PathPoint3", 415, 408);
		Poi room4PathPoint4 = new Poi("Room4PathPoint4", 362, 378);
		Poi room4PathPoint5 = new Poi("Room4PathPoint5", 332, 386);
		Poi room4PathPoint6 = new Poi("Room4PathPoint6", 298, 372);

		Node nodeRoom4PathPoint1 = new Node(room4PathPoint1.getName());
		Node nodeRoom4PathPoint2 = new Node(room4PathPoint2.getName());
		Node nodeRoom4PathPoint3 = new Node(room4PathPoint3.getName());
		Node nodeRoom4PathPoint4 = new Node(room4PathPoint4.getName());
		Node nodeRoom4PathPoint5 = new Node(room4PathPoint5.getName());
		Node nodeRoom4PathPoint6 = new Node(room4PathPoint6.getName());

		Node node59 = new Node("Phoenicians");
		Node node54 = new Node("ImportedPottery");
		Node node38 = new Node("CraftsAndArts");
		Node node37 = new Node("MaritimeCommerce");
		Node node34 = new Node("BuildingMethodsAndFacilities");
		Node node65 = new Node("ReligionAndCult");
		Node node36 = new Node("BurialTradition2");
		Node node20 = new Node("PhoenicianWriting1");
		Node node66 = new Node("EverydayPottery");

		/*Room 3*/
		Poi room3PathPoint1 = new Poi("Room3PathPoint1", 457, 292);
		Poi room3PathPoint2 = new Poi("Room3PathPoint2", 456, 266);
		Poi room3PathPoint3 = new Poi("Room3PathPoint3", 271, 267);
		Poi room3PathPoint4 = new Poi("Room3PathPoint4", 431, 192);
		Poi room3PathPoint5 = new Poi("Room3PathPoint5", 274, 192);
		Poi room3PathPoint6 = new Poi("Room3PathPoint6", 324, 107);

		Node nodeRoom3PathPoint1 = new Node(room3PathPoint1.getName());
		Node nodeRoom3PathPoint2 = new Node(room3PathPoint2.getName());
		Node nodeRoom3PathPoint3 = new Node(room3PathPoint3.getName());
		Node nodeRoom3PathPoint4 = new Node(room3PathPoint4.getName());
		Node nodeRoom3PathPoint5 = new Node(room3PathPoint5.getName());
		Node nodeRoom3PathPoint6 = new Node(room3PathPoint6.getName());

		Node node32 = new Node("WoodenTools");
		Node node52 = new Node("StoneVesselsBowl");
		Node node58 = new Node("MosaicfromSynagogue");
		Node node45 = new Node("BronzeTools");
		Node node55 = new Node("GlassOvenVessels");
		Node node78 = new Node("StairsToBathroom");

		/*Room 3*/
		Poi room5PathPoint1 = new Poi("Room5PathPoint1", 182, 186);
		Poi room5PathPoint2 = new Poi("Room5PathPoint2", 36, 181);

		Node nodeRoom5PathPoint1 = new Node(room5PathPoint1.getName());
		Node nodeRoom5PathPoint2 = new Node(room5PathPoint2.getName());

		Node node18 = new Node("ShipEntrance");
		Node node50 = new Node("ShipFront");
		Node node33 = new Node("ShipBack");
		Node node46 = new Node("MaritimeArcheology");
		Node node21 = new Node("Pottery");
		Node node44 = new Node("CarpenterTools");

		/*Room 2*/
		Poi room2PathPoint1 = new Poi("Room2PathPoint1", 541, 66);
		Poi room2PathPoint2 = new Poi("Room2PathPoint2", 663, 109);

		Node nodeRoom2PathPoint1 = new Node(room2PathPoint1.getName());
		Node nodeRoom2PathPoint2 = new Node(room2PathPoint2.getName());

		Node node62 = new Node("EntranceGallileeRebellion");
		Node node47 = new Node("DuckBoxIvories");
		Node node72 = new Node("CanaaniteStelae");
		Node node60 = new Node("IvoryWomanPhoenician");
		Node node64 = new Node("ClayAmphorae");
		Node node5 = new Node("AnimalModels");
		Node node100 = new Node("Elevator1");
		Node node101 = new Node("MuseumMotto");
		
		/*Room 7*/
		Poi room7PathPoint1 = new Poi("Room7PathPoint1", 664, 291);
		Poi room7PathPoint2 = new Poi("Room7PathPoint2", 515, 248);
		Poi room7PathPoint3 = new Poi("Room7PathPoint3", 656, 376);
		Poi room7PathPoint4 = new Poi("Room7PathPoint4", 592, 390);
		
		Node nodeRoom7PathPoint1 = new Node(room7PathPoint1.getName());
		Node nodeRoom7PathPoint2 = new Node(room7PathPoint2.getName());
		Node nodeRoom7PathPoint3 = new Node(room7PathPoint3.getName());
		Node nodeRoom7PathPoint4 = new Node(room7PathPoint4.getName());
		
		Node node63 = new Node("ChalcolitePeriod");
		Node node39 = new Node("LeadCoffinMosaics");
		Node node49 = new Node("MaterialCultures");
		Node node40 = new Node("JewishCoffins");
		Node node56 = new Node("Anthropoids");
		Node node16 = new Node("DecoratedDoors");
		Node node53 = new Node("MenorahJewishEpigraphy");
		Node node2 = new Node("RomanDivinitiesStatuettes");
		
		/*Room 6*/
		Poi room6PathPoint1 = new Poi("Room6PathPoint1", 791, 68);
		Poi room6PathPoint2 = new Poi("Room6PathPoint2", 792, 238);
		Poi room6PathPoint3 = new Poi("Room6PathPoint3", 851, 155);
		Poi room6PathPoint4 = new Poi("Room6PathPoint4", 982, 235);	
		Poi room6PathPoint5 = new Poi("Room6PathPoint5", 964, 111);
		
		Node nodeRoom6PathPoint1 = new Node(room6PathPoint1.getName());
		Node nodeRoom6PathPoint2 = new Node(room6PathPoint2.getName());
		Node nodeRoom6PathPoint3 = new Node(room6PathPoint3.getName());
		Node nodeRoom6PathPoint4 = new Node(room6PathPoint4.getName());
		Node nodeRoom6PathPoint5 = new Node(room6PathPoint5.getName());
		
		Node node76 = new Node("Elevator2");
		Node node6 = new Node("Gems");
		Node node8 = new Node("Weights");
		Node node57 = new Node("TempleMount");
		Node node70 = new Node("Cyprus");
		Node node48 = new Node("Jerusalem");
		Node node61 = new Node("GreeceEgypt");
		Node node71 = new Node("SevenSpecies");
		Node node67 = new Node("Coins");
		Node node68 = new Node("OilLamps");
		Node node3 = new Node("UpperFloorEntrance");


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

		dijkstra.computePaths(start);
		List<Node> path = dijkstra.getShortestPathTo(node74);
		System.out.println("Path: " + path);
		
	}

}
