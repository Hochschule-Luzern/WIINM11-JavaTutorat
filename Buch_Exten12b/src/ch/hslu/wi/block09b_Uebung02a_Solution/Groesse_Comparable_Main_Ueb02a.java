package ch.hslu.wi.block09b_Uebung02a_Solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Groesse_Comparable_Main_Ueb02a {

	public static int grundflaeche(Groesse g) {
		return g.breite() * g.laenge();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Groesse f1 = new Fussballplatz();
		Groesse a3 = new PapierBlatt("A3");
		System.out.println("a3.laenge" + a3.laenge());
		Groesse a4 = new PapierBlatt("A4");
		System.out.println("a4.laenge" + a4.laenge());
		Groesse a5 = new PapierBlatt("A5");

		System.out.println("Fläche von f1 in mm^2: " + grundflaeche(f1));
		System.out.println("Fläche von A3 in mm^2: " + grundflaeche(a3));
		System.out.println("Fläche von A4 in mm^2: " + grundflaeche(a4));
		System.out.println("Fläche von A5 in mm^2: " + grundflaeche(a5));

		// Liste mit Papierblättern, wird über deren compareTo Methode sortiert
		List<Groesse> l2 = new LinkedList<Groesse>();
		l2.add(a5);
		l2.add(a4);
		l2.add(a3);
		l2.add(a4);
		l2.add(f1);

		double summe = 0;
		for (int i = 0; i < l2.size(); i++) {
			summe = summe + grundflaeche(l2.get(i));
		}
		System.out.println("Die Gesamtfläche beträgt: " + summe);

		// Test von compareTo() hier:
		int i = a4.compareTo(a5);
		System.out.println("i = a4.compareTo(a5): " + i);
		i = a5.compareTo(a4);
		System.out.println("i = a5.compareTo(a4): " + i);
		i = a4.compareTo(a4);
		System.out.println("i = a4.compareTo(a4): " + i);
	
		// zur Ausgabe beigefügten "Grössen"-Objekte / -Interfaces 
		for(Groesse it: l2){
			System.out.println("Länge: " + it.laenge() + " x  Breite: " + it.breite());
		}		
		Collections.sort(l2);
		// zur Ausgabe beigefügten "Grössen"-Objekte / -Interfaces 
		for(Groesse it: l2){
			System.out.println("Länge: " + it.laenge() + " x  Breite: " + it.breite());
		}
		
		
		
	}

}
