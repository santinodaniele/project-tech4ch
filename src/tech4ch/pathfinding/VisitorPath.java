package tech4ch.pathfinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import es.usc.citius.hipster.algorithm.Hipster;
import es.usc.citius.hipster.graph.GraphBuilder;
import es.usc.citius.hipster.graph.GraphSearchProblem;
import es.usc.citius.hipster.graph.HipsterGraph;
import es.usc.citius.hipster.model.problem.SearchProblem;
import tech4ch.model.Poi;
import tech4ch.model.Position;
import tech4ch.model.Visitor;

public class VisitorPath{


	public static ArrayList<Position> getVisitorPath(Visitor visitor){
		ArrayList<Position> coordList = new ArrayList<Position>();
		ArrayList<Poi> sourcePoiList = new ArrayList<Poi>();
		sourcePoiList.addAll(visitor.getPoiList());
		sourcePoiList.remove(sourcePoiList.size()-1);
		ArrayList<Poi> targetPoiList = new ArrayList<Poi>();
		targetPoiList.addAll(visitor.getPoiList()); 
		targetPoiList.remove(0);
		for(int i = 0; i < targetPoiList.size(); i++){
			ArrayList<Position> subPath = getSubPath(sourcePoiList.get(i), targetPoiList.get(i));
			coordList.addAll(subPath); 
		}
		return coordList;
	}


	public static ArrayList<Position> getSubPath(Poi start, Poi target){
		/* Room 1 */
		Poi room1PathPoint1 = new Poi("Room1PathPoint1", 613, 459);
		Poi room1PathPoint2 = new Poi("Room1PathPoint2", 496, 454);
		Poi entranceReubenHecht = new Poi("EntranceReubenHecht", 714, 438);
		Poi symbolsJewishMenorah = new Poi("SymbolsJewishMenorah", 654, 480);
		Poi persianCult = new Poi("PersianCult", 585, 481);
		Poi jerusalemPhoto = new Poi("JerusalemPhoto", 501, 486);

		/* Room 2 */
		Poi room2PathPoint1 = new Poi("Room2PathPoint1", 541, 66);
		Poi room2PathPoint2 = new Poi("Room2PathPoint2", 663, 109);
		Poi museumMotto = new Poi("MuseumMotto", 506,213);
		Poi entranceGallileeRebellion = new Poi("EntranceGallileeRebellion", 489, 124);
		Poi duckBoxIvories = new Poi("DuckBoxIvories", 542, 90);
		Poi canaaniteStelae = new Poi("CanaaniteStelae", 543, 53);
		Poi ivoryWomanPhoenician = new Poi("IvoryWomanPhoenician", 636, 75);
		Poi clayAmphorae = new Poi("ClayAmphorae", 670, 91);
		Poi animalModels = new Poi("AnimalModels", 620, 186);
		Poi elevator1 = new Poi("Elevator1", 501, 57);

		/* Room 3 */
		Poi room3PathPoint1 = new Poi("Room3PathPoint1", 457, 292);
		Poi room3PathPoint2 = new Poi("Room3PathPoint2", 456, 266);
		Poi room3PathPoint3 = new Poi("Room3PathPoint3", 271, 267);
		Poi room3PathPoint4 = new Poi("Room3PathPoint4", 431, 192);
		Poi room3PathPoint5 = new Poi("Room3PathPoint5", 274, 192);
		Poi room3PathPoint6 = new Poi("Room3PathPoint6", 324, 107);
		Poi stairsToBathroom = new Poi("StairsToBathroom", 356, 45);
		Poi bronzeTools = new Poi("BronzeTools", 456, 183);
		Poi stoneVesselsBowl = new Poi("StoneVesselsBowl",390, 277);
		Poi mosaicfromSynagogue = new Poi("MosaicfromSynagogue", 430, 258);
		Poi glassOvenVessels = new Poi("GlassOvenVessels", 373, 159);
		Poi woodenTools = new Poi("WoodenTools", 272, 293);

		/* Room 4 */
		Poi room4PathPoint1 = new Poi("Room4PathPoint1", 496, 312);
		Poi room4PathPoint2 = new Poi("Room4PathPoint2", 417, 305);
		Poi room4PathPoint3 = new Poi("Room4PathPoint3", 415, 408);
		Poi room4PathPoint4 = new Poi("Room4PathPoint4", 362, 378);
		Poi room4PathPoint5 = new Poi("Room4PathPoint5", 332, 386);
		Poi room4PathPoint6 = new Poi("Room4PathPoint6", 298, 372);
		Poi phoenicians = new Poi("Phoenicians", 453,315);
		Poi importedPottery = new Poi("ImportedPottery", 379, 406);
		Poi craftsAndArts = new Poi("CraftsAndArts", 390, 370);
		Poi religionAndCult = new Poi("ReligionAndCult", 354, 334);
		Poi everydayPottery = new Poi("EverydayPottery", 316, 336);
		Poi phoenicianWriting1 = new Poi("PhoenicianWriting1", 290, 358);
		Poi burialTradition2 = new Poi("BurialTradition2", 283, 398);
		Poi maritimeCommerce = new Poi("MaritimeCommerce", 334, 403);
		Poi buildingMethodsAndFacilities = new Poi("BuildingMethodsAndFacilities", 342, 371);

		/* Room 5 */
		Poi room5PathPoint1 = new Poi("Room5PathPoint1", 182, 186);
		Poi room5PathPoint2 = new Poi("Room5PathPoint2", 36, 181);
		Poi shipEntrance = new Poi("ShipEntrance", 230, 145);
		Poi shipFront = new Poi("ShipFront", 178, 148);
		Poi shipBack = new Poi("ShipBack", 132, 106);
		Poi maritimeArcheology = new Poi("MaritimeArcheology", 23, 181);
		Poi pottery = new Poi("Pottery", 23, 139);
		Poi carpenterTools = new Poi("CarpenterTools", 23, 76);

		/* Room 6 */
		Poi room6PathPoint1 = new Poi("Room6PathPoint1", 791, 68);
		Poi room6PathPoint2 = new Poi("Room6PathPoint2", 792, 238);
		Poi room6PathPoint3 = new Poi("Room6PathPoint3", 851, 155);
		Poi room6PathPoint4 = new Poi("Room6PathPoint4", 982, 235);	
		Poi room6PathPoint5 = new Poi("Room6PathPoint5", 964, 111);
		Poi coins = new Poi("Coins", 769, 247);
		Poi sevenSpecies = new Poi("SevenSpecies", 839, 226);
		Poi weights = new Poi("Weights", 795, 137);
		Poi greeceEgypt = new Poi("GreeceEgypt", 975, 133);
		Poi gems = new Poi("Gems", 853, 49);
		Poi cyprus = new Poi("Cyprus", 952, 88);
		Poi jerusalem = new Poi("Jerusalem", 905, 147);
		Poi templeMount = new Poi("TempleMount", 843, 117);
		Poi oilLamps = new Poi("OilLamps", 961, 233);
		Poi upperFloorEntrance = new Poi("UpperFloorEntrance", 958, 285);
		Poi elevator2 = new Poi("Elevator2", 781, 39);

		/* Room 7 */
		Poi room7PathPoint1 = new Poi("Room7PathPoint1", 664, 291);
		Poi room7PathPoint2 = new Poi("Room7PathPoint2", 515, 248);
		Poi room7PathPoint3 = new Poi("Room7PathPoint3", 656, 376);
		Poi room7PathPoint4 = new Poi("Room7PathPoint4", 592, 390);
		Poi materialCultures = new Poi("MaterialCultures", 668, 307);
		Poi leadCoffinMosaic = new Poi("LeadCoffinMosaic", 603, 298);
		Poi chalcolitePeriod = new Poi("ChalcolitePeriod", 537, 291);
		Poi jewishCoffins = new Poi("JewishCoffins", 585, 337);
		Poi anthropoids = new Poi("Anthropoids", 548, 388);
		Poi decoratedDoors = new Poi("DecoratedDoors", 529, 419);
		Poi menorahJewishEpigraphy = new Poi("MenorahJewishEpigraphy", 606, 415);
		Poi romanDivinitiesStatuettes = new Poi("RomanDivinitiesStatuettes", 668, 407);

		HipsterGraph<Poi, Double> graph = 
				GraphBuilder.<Poi,Double>create()
				/* Room 1 */
				.connect(room1PathPoint1).to(entranceReubenHecht).withEdge(1d)
				.connect(room1PathPoint1).to(symbolsJewishMenorah).withEdge(1d)
				.connect(room1PathPoint1).to(persianCult).withEdge(1d)
				.connect(room1PathPoint1).to(room1PathPoint2).withEdge(1d)
				.connect(room1PathPoint2).to(jerusalemPhoto).withEdge(1d)
				/* Room 2 */
				.connect(entranceGallileeRebellion).to(room3PathPoint6).withEdge(1d)
				.connect(entranceGallileeRebellion).to(elevator1).withEdge(1d)
				.connect(entranceGallileeRebellion).to(museumMotto).withEdge(1d)
				.connect(entranceGallileeRebellion).to(room2PathPoint1).withEdge(1d)
				.connect(room2PathPoint1).to(elevator1).withEdge(1d)
				.connect(room2PathPoint1).to(canaaniteStelae).withEdge(1d)
				.connect(room2PathPoint1).to(duckBoxIvories).withEdge(1d)
				.connect(room2PathPoint1).to(room2PathPoint2).withEdge(1d)
				.connect(room2PathPoint2).to(ivoryWomanPhoenician).withEdge(1d)
				.connect(room2PathPoint2).to(clayAmphorae).withEdge(1d)
				.connect(room2PathPoint2).to(animalModels).withEdge(1d)
				.connect(elevator1).to(elevator2).withEdge(1d)
				/* Room 3 */
				.connect(room3PathPoint1).to(room3PathPoint2).withEdge(1d)
				.connect(room3PathPoint2).to(bronzeTools).withEdge(1d)
				.connect(room3PathPoint2).to(mosaicfromSynagogue).withEdge(1d)
				.connect(room3PathPoint2).to(stoneVesselsBowl).withEdge(1d)
				.connect(stoneVesselsBowl).to(room3PathPoint3).withEdge(1d)
				.connect(room3PathPoint3).to(woodenTools).withEdge(1d)
				.connect(room3PathPoint1).to(room3PathPoint2).withEdge(1d)
				.connect(woodenTools).to(room4PathPoint2).withEdge(1d)
				.connect(bronzeTools).to(room3PathPoint4).withEdge(1d)
				.connect(room3PathPoint4).to(room3PathPoint5).withEdge(1d)
				.connect(room3PathPoint5).to(room3PathPoint6).withEdge(1d)
				.connect(room3PathPoint6).to(stairsToBathroom).withEdge(1d)
				.connect(room3PathPoint6).to(glassOvenVessels).withEdge(1d)
				/* Room 4 */
				.connect(room4PathPoint1).to(room1PathPoint2).withEdge(1d)
				.connect(room4PathPoint1).to(phoenicians).withEdge(1d)
				.connect(room4PathPoint1).to(room3PathPoint1).withEdge(1d)
				.connect(room4PathPoint1).to(room4PathPoint2).withEdge(1d)
				.connect(room4PathPoint2).to(room4PathPoint3).withEdge(1d)
				.connect(room4PathPoint3).to(importedPottery).withEdge(1d)
				.connect(room4PathPoint3).to(room4PathPoint4).withEdge(1d)
				.connect(room4PathPoint4).to(room4PathPoint5).withEdge(1d)
				.connect(room4PathPoint4).to(religionAndCult).withEdge(1d)
				.connect(room4PathPoint4).to(craftsAndArts).withEdge(1d)
				.connect(room4PathPoint5).to(maritimeCommerce).withEdge(1d)
				.connect(room4PathPoint5).to(buildingMethodsAndFacilities).withEdge(1d)
				.connect(room4PathPoint5).to(room4PathPoint6).withEdge(1d)
				.connect(room4PathPoint6).to(everydayPottery).withEdge(1d)
				.connect(room4PathPoint6).to(phoenicianWriting1).withEdge(1d)
				.connect(room4PathPoint6).to(burialTradition2).withEdge(1d)
				/* Room 5 */
				.connect(shipEntrance).to(room3PathPoint6).withEdge(1d)
				.connect(shipEntrance).to(shipFront).withEdge(1d)
				.connect(shipFront).to(shipBack).withEdge(1d)
				.connect(shipFront).to(room5PathPoint1).withEdge(1d)
				.connect(room5PathPoint1).to(room5PathPoint2).withEdge(1d)
				.connect(room5PathPoint2).to(maritimeArcheology).withEdge(1d)
				.connect(maritimeArcheology).to(pottery).withEdge(1d)
				.connect(pottery).to(carpenterTools).withEdge(1d)
				/* Room 6 */
				.connect(room6PathPoint1).to(elevator2).withEdge(1d)
				.connect(room6PathPoint1).to(gems).withEdge(1d)
				.connect(room6PathPoint1).to(room6PathPoint2).withEdge(1d)
				.connect(weights).to(room6PathPoint2).withEdge(1d)
				.connect(room6PathPoint2).to(coins).withEdge(1d)
				.connect(room6PathPoint2).to(sevenSpecies).withEdge(1d)
				.connect(room6PathPoint2).to(room6PathPoint3).withEdge(1d)
				.connect(room6PathPoint3).to(templeMount).withEdge(1d)
				.connect(room6PathPoint3).to(jerusalem).withEdge(1d)
				.connect(room6PathPoint3).to(room6PathPoint4).withEdge(1d)
				.connect(room6PathPoint4).to(oilLamps).withEdge(1d)
				.connect(room6PathPoint4).to(upperFloorEntrance).withEdge(1d)
				.connect(room6PathPoint4).to(room6PathPoint5).withEdge(1d)
				.connect(room6PathPoint5).to(greeceEgypt).withEdge(1d)
				.connect(room6PathPoint5).to(cyprus).withEdge(1d)
				/* Room 7 */
				.connect(room7PathPoint1).to(animalModels).withEdge(1d)
				.connect(room7PathPoint1).to(room7PathPoint2).withEdge(1d)
				.connect(room7PathPoint1).to(materialCultures).withEdge(1d)
				.connect(room7PathPoint1).to(leadCoffinMosaic).withEdge(1d)
				.connect(room7PathPoint1).to(chalcolitePeriod).withEdge(1d)
				.connect(room7PathPoint1).to(room7PathPoint3).withEdge(1d)
				.connect(room7PathPoint2).to(museumMotto).withEdge(1d)
				.connect(room7PathPoint2).to(room4PathPoint1).withEdge(1d)
				.connect(room7PathPoint3).to(romanDivinitiesStatuettes).withEdge(1d)
				.connect(room7PathPoint3).to(room7PathPoint4).withEdge(1d)
				.connect(room7PathPoint4).to(jewishCoffins).withEdge(1d)
				.connect(room7PathPoint4).to(menorahJewishEpigraphy).withEdge(1d)
				.connect(room7PathPoint4).to(anthropoids).withEdge(1d)
				.connect(room7PathPoint4).to(decoratedDoors).withEdge(1d)
				.createUndirectedGraph();

		ArrayList<Position> subPath = new ArrayList<Position>();
		Poi tmpStart = null;
		Poi tmpTarget = null;
		for(Poi poi : graph.vertices()) {
			if(poi.getName().equals(start.getName())) tmpStart = poi;
			if(poi.getName().equals(target.getName())) tmpTarget = poi;
		}
		SearchProblem p = GraphSearchProblem.startingFrom(tmpStart).in(graph).takeCostsFromEdges().build(); 
		List<LinkedList<Poi>> path = Hipster.createDijkstra(p).search(tmpTarget).getOptimalPaths();
		for(LinkedList<Poi> currPath : path) { 
			for(Poi poi : currPath) {
				subPath.add(poi.getPosition()); 
			} 
		}
		return subPath;
	}
}
