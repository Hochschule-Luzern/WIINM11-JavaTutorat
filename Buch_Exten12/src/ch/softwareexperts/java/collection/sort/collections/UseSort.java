package ch.softwareexperts.java.collection.sort.collections;
import java.util.*;

public class UseSort {

	public static void main(String[] args) {

		//Set-construction 
		List<String> s = new ArrayList<String>();

		s.add("Hans");
		s.add("Adolf");
		s.add("Eva");
		s.add("Anna");
		s.add("Lydia"); 
		s.add("Rudolf");

		//Unsorted output
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
		System.out.println("---");

		//Sorted output
		Collections.sort(s);
		it = s.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
	}
}