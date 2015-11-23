package ch.softwareexperts.java.collection.treeSet;
import java.util.*;

public class UseTreeSet {

	public static void main(String[] args) {

		//Set-construction
		TreeSet<String> s = new TreeSet<String>();
		s.add("Hans");
		s.add("Adolf");
		s.add("Eva");
		s.add("Anna");
		s.add("Lydia");
		s.add("Rudolf");

		//Sorted output
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
	}
}