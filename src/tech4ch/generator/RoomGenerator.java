package tech4ch.generator;

import java.util.ArrayList;

import tech4ch.model.Poi;
import tech4ch.model.Room;

public class RoomGenerator {

	public ArrayList<Room> initRooms() {
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		
		//Room 1
		Room room1 = new Room(1);
		room1.addPoi("EntranceReubenHecht");
		room1.addPoi("SymbolsJewishMenorah");
		room1.addPoi("PersianCult");
		room1.addPoi("JerusalemPhoto");

		//Room2
		Room room2 = new Room(2);
		room2.addPoi("MuseumMotto");
		room2.addPoi("EntranceGallileeRebellion");
		room2.addPoi("DuckBoxIvories");
		room2.addPoi("CanaaniteStelae");
		room2.addPoi("IvoryWomanPhoenician");
		room2.addPoi("ClayAmphorae");
		room2.addPoi("AnimalModels");
		room2.addPoi("Elevator1");

		//Room 3
		Room room3 = new Room(3);
		room3.addPoi("StairsToBathroom");
		room3.addPoi("BronzeTools");
		room3.addPoi("StoneVesselsBowl");
		room3.addPoi("MosaicfromSynagogue");
		room3.addPoi("GlassOvenVessels");
		room3.addPoi("WoodenTools");

		//Room 4
		Room room4 = new Room(4);
		room4.addPoi("Phoenicians");
		room4.addPoi("ImportedPottery");
		room4.addPoi("CraftsAndArts");
		room4.addPoi("ReligionAndCult");
		room4.addPoi("EverydayPottery");
		room4.addPoi("PhoenicianWriting1");
		room4.addPoi("BurialTradition2");
		room4.addPoi("MaritimeCommerce");
		room4.addPoi("BuildingMethodsAndFacilities");

		//Room 5
		Room room5 = new Room(5);
		room5.addPoi("ShipEntrance");
		room5.addPoi("ShipFront");
		room5.addPoi("ShipBack");
		room5.addPoi("MaritimeArcheology");
		room5.addPoi("Pottery");
		room5.addPoi("CarpenterTools");

		//Room 6
		Room room6 = new Room(6);
		room6.addPoi("Coins");
		room6.addPoi("SevenSpecies");
		room6.addPoi("Weights");
		room6.addPoi("GreeceEgypt");
		room6.addPoi("Gems");
		room6.addPoi("Cyprus");
		room6.addPoi("Jerusalem");
		room6.addPoi("TempleMount");
		room6.addPoi("OilLamps");
		room6.addPoi("UpperFloorEntrance");
		room6.addPoi("Elevator2");
		
		//Room 7
		Room room7 = new Room(7);
		room7.addPoi("MaterialCultures");
		room7.addPoi("LeadCoffinMosaics");
		room7.addPoi("ChalcolitePeriod");
		room7.addPoi("JewishCoffins");
		room7.addPoi("Anthropoids");
		room7.addPoi("DecoratedDoors");
		room7.addPoi("MenorahJewishEpigraphy");
		room7.addPoi("RomanDivinitiesStatuettes");
		
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
		rooms.add(room5);
		rooms.add(room6);
		rooms.add(room7);
		return rooms;

	}
}

