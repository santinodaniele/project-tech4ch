package tech4ch.stats;

import java.util.ArrayList;
import java.util.HashMap;

import tech4ch.model.Presentation;
import tech4ch.model.Visitor;

public class VisitorStats {

	public void averagePresentationTime(ArrayList<Visitor> visitorList) {
		HashMap<Presentation, Integer> presentation2seconds = new HashMap<>();
		for(Visitor v : visitorList) {
			HashMap<Presentation, Integer> presentationToSecondTmp = v.getPresentation2seconds();
			for(Presentation p : presentationToSecondTmp.keySet()) {
				if(presentation2seconds.containsKey(p)) {
					int updateTime = presentation2seconds.get(p) + presentationToSecondTmp.get(p);
					presentation2seconds.put(p, updateTime);
				}
				else {
					presentation2seconds.put(p, presentationToSecondTmp.get(p));
				}
			}
		}
		for(Presentation p: presentation2seconds.keySet()) {
			int numTotVisitor = visitorList.size();
			int averageTime = presentation2seconds.get(p)/ numTotVisitor;
			presentation2seconds.put(p, averageTime);
		}
	}
	
	public void averagePresentationNumber(ArrayList<Visitor> visitorList) {
		HashMap<Presentation, Integer> presentation2TotalPresentation = new HashMap<>();
		for(Visitor v : visitorList) {
			HashMap<Presentation, Integer> presentationToSecondTmp = v.getPresentation2seconds();
			for(Presentation p : presentationToSecondTmp.keySet()) {
				if(presentation2TotalPresentation.containsKey(p)) {
					int updateQuantity = presentation2TotalPresentation.get(p) + 1;
					presentation2TotalPresentation.put(p, updateQuantity);
				}
				else {
					presentation2TotalPresentation.put(p, 1);
				}
			}
		}
		for(Presentation p: presentation2TotalPresentation.keySet()) {
			int numTotVisitor = visitorList.size();
			int averageTime = presentation2TotalPresentation.get(p)/ numTotVisitor;
			presentation2TotalPresentation.put(p, averageTime);
		}	
	}
}
