package uebung04_05;

import java.util.Comparator;

public class LaengeComparator implements Comparator<Groesse> {

	@Override
	public int compare(Groesse o1, Groesse o2) {
		// TODO Auto-generated method stub
		if (o1.laenge() > o2.laenge()) {
			return 1;
		} else if (o1.laenge() < o2.laenge()) {
			return -1;
		} else {
			return 0;
		}
	}

}
