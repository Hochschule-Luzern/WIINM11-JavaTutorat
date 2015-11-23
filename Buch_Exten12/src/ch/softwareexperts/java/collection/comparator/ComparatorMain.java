package ch.softwareexperts.java.collection.comparator;
import java.util.*;
 

public class ComparatorMain {

	public static void main(String[] args) {

		Line[] la = new Line[10];
		for (int i = 0; i < la.length; i++) {
			la[i] = new Line(Tools.genRandomNumber(100), Tools.genRandomNumber(200));
		}

		System.out.println("Folgende Linien wurden generiert: \n");

		//Construction off the set
		TreeSet s = new TreeSet(new ComparatorLines());
		for (int i = 0; i < la.length; i++) {
			s.add(la[i]);
			System.out.println(la[i].toString());
		}

		System.out.println("\n\n\nDer Länge nach sortiert: \n");
		//Sorted output
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}


	}
}

