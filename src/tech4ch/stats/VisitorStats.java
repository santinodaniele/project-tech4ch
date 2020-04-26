package tech4ch.stats;

import java.util.ArrayList;
import java.util.HashMap;

import tech4ch.model.Presentation;
import tech4ch.model.Visitor;

public class VisitorStats {


	public String getGroupStats(ArrayList<Visitor> groupVisitorList, ArrayList<Presentation> presentationList, HashMap<Integer, ArrayList<Visitor>> group2visitor) {
		int groupOfOneOrTwo = 0;
		int totalGroupNumber = group2visitor.keySet().size();
		for(Integer group : group2visitor.keySet()) {
			if(group2visitor.get(group).size() == 2 || group2visitor.get(group).size() == 1) {
				groupOfOneOrTwo++;
			}
		}
		StringBuilder strBuilder = new StringBuilder();
		int presentationViewed = 0;
		strBuilder.append("<h3>");
		strBuilder.append("GROUP " + groupVisitorList.get(0).getGroupId());
		strBuilder.append("</h3>");
		for(Visitor v : groupVisitorList) {
			strBuilder.append("<h5>");
			strBuilder.append("" + "Visitor " + v.getId() + " watched:");
			strBuilder.append("</h5>");
			for(Presentation p : v.getPresentation2seconds().keySet()) {
				strBuilder.append("<li>");
				strBuilder.append("Presentation about " + p.getPoiName() + " for " + v.getPresentation2seconds().get(p)/60 + " minutes");
				strBuilder.append(", ended by " + p.getTerminatedBy() + ".");
				int index = presentationList.indexOf(p);
				
				strBuilder.append(" Average time: " + presentationList.get(index).getTotalGroupSeconds()/(totalGroupNumber-groupOfOneOrTwo)  + " minutes.");
				strBuilder.append("</li>");
			}
			presentationViewed += v.getPresentation2seconds().keySet().size();
		}
		strBuilder.append("<h5>");
		strBuilder.append("This group viewed " + presentationViewed/groupVisitorList.size() + " presentations. ");
		strBuilder.append("Average presentation viewed: " + presentationList.size()/(totalGroupNumber-groupOfOneOrTwo));
		strBuilder.append("</h5>");
		return strBuilder.toString();
	}
		
}
