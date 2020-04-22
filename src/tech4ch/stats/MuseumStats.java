package tech4ch.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

import tech4ch.comparator.PoiMinuteComparator;
import tech4ch.comparator.PoiVisitorComparator;
import tech4ch.model.Poi;
import tech4ch.model.Room;
import tech4ch.model.Visitor;

public class MuseumStats {

	public static final int closingHour = 17;
	public static final int maxRoomNumber = 7;
	public static final int maxRankingNumber = 10;

	public ArrayList<Poi> getPoiStats(ArrayList<Visitor> visitorList, ArrayList<Poi> poiList) {
		ArrayList<Poi> resultPoiList = new ArrayList<Poi>();
		for(Poi p : poiList) {
			for(Visitor v : visitorList) {
				p.countSeconds(v);
				p.countVisitor(v);
			}
			resultPoiList.add(p);
		}
		return resultPoiList;
	}

	public ArrayList<Poi> getBestHoldingPowerPoi(ArrayList<Visitor> visitorList, ArrayList<Poi> poiList) {
		for(Poi p : poiList) {
			for(Visitor v : visitorList) {
				p.countSeconds(v);
			}
		}
		ArrayList<Poi> orderedPoiList = poiList;
		Collections.sort(orderedPoiList, new PoiMinuteComparator());
		return orderedPoiList;
	}

	public ArrayList<Poi> getBestAttractionPowerPoi(ArrayList<Visitor> visitorList, ArrayList<Poi> poiList) {
		for(Poi p : poiList) {
			for(Visitor v : visitorList) {
				p.countVisitor(v);
			}
		}
		ArrayList<Poi> orderedPoiList = poiList;
		Collections.sort(orderedPoiList, new PoiVisitorComparator());
		return orderedPoiList;
	}

	public TreeMap<Integer, Integer> getVisitorPerAllHours(ArrayList<Visitor> visitorList) {
		TreeMap<Integer, Integer> hour2visitor = new TreeMap<Integer, Integer>();
		for(int hour = 10; hour <= closingHour; hour++) {
			int vph = 0; /* visitor per hour */
			for(Visitor v : visitorList) {
				if(v.getHour2poi().containsKey(hour)) {
					vph++;
				}
			}
			hour2visitor.put(hour, vph);
		}
		return hour2visitor;
	}

	public void getVisitorsPerRoomsPerAllHours(ArrayList<Visitor> visitorList, ArrayList<Room> roomList) {
		for(int roomNumber = 1; roomNumber <= maxRoomNumber; roomNumber++) {
			for(int hour = 10; hour <= closingHour; hour++) {
				int vrph = 0; /* visitor per room per hour */
				Room room = roomList.get(roomNumber - 1);
				for(Visitor v : visitorList) {
					if(v.getHour2poi().containsKey(hour)) {
						ArrayList<String> poiList = v.getHour2poi().get(hour);
						for(String s : poiList){
							if(room.getPoiList().contains(s) && !room.isVisited()) {
								vrph++;
								room.setVisited(true);
							}
						}
					}
					room.setVisited(false);
				}
				room.getHour2visitor().put(hour, vrph);
			}
		}
	}
}
