package tech4ch.stats;

import java.util.ArrayList;
import java.util.HashMap;

import tech4ch.model.Presentation;
import tech4ch.model.Visitor;

public class VisitorStats {

	public void averagePresentationTime(ArrayList<Visitor> visitorList) {
		HashMap<String, Integer> presentation2seconds = new HashMap<>();
		for(Visitor v : visitorList) {
			HashMap<String, Integer> presentation2secondsTmp = v.getPresentation2seconds();
			for(String poiName : presentation2secondsTmp.keySet()) {
				if(presentation2seconds.containsKey(poiName)) {
					int updateTime = presentation2seconds.get(poiName) + presentation2secondsTmp.get(poiName);
					presentation2seconds.put(poiName, updateTime);
				}
				else {
					presentation2seconds.put(poiName, presentation2secondsTmp.get(poiName));
				}
			}
		}
		/*
		 * for(String poiName: presentation2seconds.keySet()) { int numTotVisitor =
		 * visitorList.size(); int averageTime = presentation2seconds.get(poiName)/
		 * numTotVisitor; presentation2seconds.put(poiName, averageTime); }
		 */
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
		/*
		 * for(String poiName: presentation2TotalPresentation.keySet()) { int
		 * numTotVisitor = visitorList.size(); int averageTime =
		 * presentation2TotalPresentation.get(poiName)/ numTotVisitor;
		 * presentation2TotalPresentation.put(poiName, averageTime); }
		 */
	}
}
