package tech4ch.comparator;

import java.util.Comparator;
import tech4ch.model.Poi;

public class PoiMinuteComparator implements Comparator<Poi> {

	@Override
	public int compare(Poi p1, Poi p2) {
		if(p1.getTotalSeconds() == p2.getTotalSeconds()) return 0;
		else if (p1.getTotalSeconds() > p2.getTotalSeconds()) return -1;
		else return 1;
	}
}


