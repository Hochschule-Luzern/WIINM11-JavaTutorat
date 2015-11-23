package ch.softwareexperts.java.collection.iterator;
import java.util.*;

public class UseIterator {

	public static void main(String[] args) {
        
        
		//fill the list
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 1; i <= 20; ++i) {
			list.add("" + i);
		}

		//Delete elements
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if (s.startsWith("1")) {
				it.remove();
			}
		}

		//Output the elements still in
		it = list.iterator();
		while (it.hasNext()) {
			System.out.println((String) it.next());
		}
	}
}