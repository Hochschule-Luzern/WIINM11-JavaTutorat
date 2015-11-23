package ch.softwareexperts.java.collection.treeSetReverse;
import java.util.*;

public class UseTreeSetReverseEx {

	public static void main(String[] args) {

		//Construction off the set
		TreeSet<String> s = new TreeSet<String>(new ReverseStringComparator());
		
		// add some persons name (e.g "Ueli", "Anna" ...)
		//YOUR WORK !!!

		//Reverse sorted output
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
	}
}

class ReverseStringComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		
		  // YOUR WORK !!
		return 1 ;        // diese Zeile muss korrigiert werden!
	}
}