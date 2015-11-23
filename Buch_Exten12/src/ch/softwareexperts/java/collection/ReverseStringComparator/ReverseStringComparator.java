package ch.softwareexperts.java.collection.ReverseStringComparator;


import java.util.*;


class ReverseStringComparator implements Comparator<String> {
	

	public int compare(String o1, String o2) {
		return (o2).compareTo(o1);
	}
}