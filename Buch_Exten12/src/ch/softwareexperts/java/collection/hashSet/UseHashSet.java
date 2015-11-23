package ch.softwareexperts.java.collection.hashSet;
import java.util.*;

public class UseHashSet {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>(10);
		int doubletten = 0;
		
		//Generate Lotto-numbers
		while (set.size() < 6) {
			int num = (int) (Math.random() * 49) + 1;
			if (!set.add(new Integer(num))) {
				++doubletten;
			}
		}
		
		//Print Lotto-numbers
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(((Integer) it.next()).toString());
		}
		System.out.println("Ignorierte Doubletten: " + doubletten);
	}
}