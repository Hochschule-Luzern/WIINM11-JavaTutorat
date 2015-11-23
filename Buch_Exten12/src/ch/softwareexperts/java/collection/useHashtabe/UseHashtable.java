package ch.softwareexperts.java.collection.useHashtabe;

import java.util.*;

public class UseHashtable {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();

		//Some Aliases
		h.put("john", "john.losinger@sb.de");
		h.put("ogi", "adolf.ogi@trivadis.com");
		h.put("erwin", "erwin.mathis@mathispartner.ch");
		//Output: The keys
		Enumeration e = h.keys();
		while (e.hasMoreElements()) { // alle Elemente absuchen!

			String alias = (String) e.nextElement();
			System.out.println(alias + " --> " + h.get(alias));
		}
	}
}