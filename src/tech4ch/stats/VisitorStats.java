package tech4ch.stats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import tech4ch.model.Presentation;
import tech4ch.model.Visitor;

public class VisitorStats {

	public void averagePresentationTime(ArrayList<Visitor> visitorList) {
		HashMap<String, Integer> presentationToseconds = new HashMap<>();
		HashMap<Integer,ArrayList<Visitor>> groupToVisitor = new HashMap<>();
		for(Visitor v : visitorList) {
			if(groupToVisitor.containsKey(v.getGroupId())) {
				ArrayList<Visitor> groupToVisitorTmp = groupToVisitor.get(v.getGroupId());
				groupToVisitorTmp.add(v);
			}
			else {
				ArrayList<Visitor> groupToVisitorTmp = new ArrayList<Visitor>();
				groupToVisitorTmp.add(v);
				groupToVisitor.put(v.getGroupId(), groupToVisitorTmp);
			}
		}
		HashMap<String, Integer> presentationToSeconds = new HashMap<>();
		for(Integer groupId : groupToVisitor.keySet()) {
			for(Visitor v : groupToVisitor.get(groupId)) {
				HashMap<String, Integer> presentationTosecondsTmp = v.getPresentation2seconds();
				for(String poiName : presentationTosecondsTmp.keySet()) {
					if(presentationToSeconds.containsKey(poiName)) {
						int updateTime = presentationToSeconds.get(poiName) + presentationTosecondsTmp.get(poiName);
						presentationToSeconds.put(poiName, updateTime);
					}
					else {
						presentationToSeconds.put(poiName, presentationTosecondsTmp.get(poiName));
					}
				}

			}
		}

		for(String poiName: presentationToseconds.keySet()) { 
			int groupNumber = groupToVisitor.keySet().size();
			int averageTime = presentationToSeconds.get(poiName)/ groupNumber;
			presentationToSeconds.put(poiName, averageTime); 
		}
	}

	public void averagePresentationNumber(ArrayList<Visitor> visitorList) {
		HashMap<String, Integer> presentation2totalPresentationNumber = new HashMap<>();
		for(Visitor v : visitorList) {
			HashMap<String, Integer> presentation2totalPresentationNumberTmp = v.getPresentation2seconds();
			for(String poiName : presentation2totalPresentationNumberTmp.keySet()) {
				if(presentation2totalPresentationNumber.containsKey(poiName)) {
					int updateQuantity = presentation2totalPresentationNumber.get(poiName) + 1;
					presentation2totalPresentationNumber.put(poiName, updateQuantity);
				}
				else {
					presentation2totalPresentationNumber.put(poiName, 1);
				}
			}
		}
	}
}
