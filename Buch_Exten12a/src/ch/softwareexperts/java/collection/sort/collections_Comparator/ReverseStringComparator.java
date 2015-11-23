package ch.softwareexperts.java.collection.sort.collections_Comparator;


import java.util.*;


class ReverseStringComparator implements Comparator<String> {
	

	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}