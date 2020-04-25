package tech4ch.stats;

import java.util.ArrayList;
import java.util.HashMap;

import tech4ch.model.Presentation;
import tech4ch.model.Visitor;

public class VisitorStats {


	public void getGroupStats(ArrayList<Visitor> groupVisitorList, ArrayList<Presentation> presentationList, HashMap<Integer, ArrayList<Visitor>> group2visitor) {
		StringBuilder strBuilder = new StringBuilder();
		try {
			int presentationViewed = 0;
			strBuilder.append("GROUP " + groupVisitorList.get(0).getGroupId() + ":\n");
			for(Visitor v : groupVisitorList) {
				strBuilder.append("\t" + "Visitor " + v.getId() + " watched:\n");
				for(Presentation p : v.getPresentation2seconds().keySet()) {
					strBuilder.append("\t\tPresentation about " + p.getPoiName() + " for " + v.getPresentation2seconds().get(p)/60 + " minutes");
					strBuilder.append(", ended by " + p.getTerminatedBy() + ".");
					int index = presentationList.indexOf(p);
					//TODO debug
					strBuilder.append(" Average time: " + presentationList.get(index).getTotalGroupSeconds()/presentationList.size() + " minutes.\n");
				}
				presentationViewed += v.getPresentation2seconds().keySet().size();
			}
			strBuilder.append("This group viewed " + presentationViewed/groupVisitorList.size() + " presentations. ");
			int groupOfOne = 0;
			int totalGroupNumber = group2visitor.keySet().size();
			for(Integer group : group2visitor.keySet()) {
				if(group2visitor.get(group).size() == 2 || group2visitor.get(group).size() == 1) {
					groupOfOne++;
				}
			}
			strBuilder.append("Average presentation viewed: " + presentationList.size()/(totalGroupNumber-groupOfOne));

		}
		catch(Exception e){
			strBuilder.append("Group doesn't exist");
		}
		System.out.println(strBuilder.toString());	
	}
}
