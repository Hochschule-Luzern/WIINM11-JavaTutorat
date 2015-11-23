// A simple example using Java 2 Collections.
package ch.softwareexperts.java.collection.arrayList;
import java.util.*;

public class SimpleArrayList {

	public static void main(String[] args) {
		// Upcast because we just want to work with Collection features
		ArrayList c = new ArrayList();
		String res = "";

		for (int i = 0; i < 10; i++) {
			c.add(Integer.toString(i));
			System.out.println("Einfügen von Element '" + i + "' in ArrayList");
		}
		
		System.out.println(" ");		
		
		Iterator it = c.iterator();
		while (it.hasNext()) {
			res = (String) it.next();
			System.out.println("Auslesen von Element '" + res + "' aus ArrayList");
		}
	}
}