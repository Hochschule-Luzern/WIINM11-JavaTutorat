package ch.hslu.wi.block09b_Uebung05_Solution_02;

import java.util.Collections;
import java.util.List;


public class Groesse_Comperator_Main_Ueb05_Solution {

	public static int grundflaeche(Groesse g) {
		return g.breite() * g.laenge();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PapierBlatt a3 = new PapierBlatt("A3");
		PapierBlatt a4 = new PapierBlatt("A4");
		PapierBlatt a5 = new PapierBlatt("A5");
		PapierBlatt a6 = new PapierBlatt("A6");
		PapierBlatt a7 = new PapierBlatt("A7");

		// Liste mit Papierblättern, wird über deren compareTo Methode sortiert
		List<PapierBlatt> l2 = new MyLinkedList<PapierBlatt>(new LaengeComperator());
		l2.add(a7);
		l2.add(a5);
		l2.add(a3);
		l2.add(a4);
		l2.add(a6);
		l2.add(a5);
		l2.add(a3);
		l2.add(a4);
		l2.add(a4);
		l2.add(a6);
		l2.add(a5);
		l2.add(a3);
		
		System.out.println("Unsortiert:");
		for (PapierBlatt p : l2) {
			System.out.println(p.getFormat());
		}
		System.out.println("--------");
		System.out.println("\nSortiert:");
		Collections.sort(l2);
		for (PapierBlatt p : l2) {
			System.out.println(p.getFormat());
		}
		
		System.out.println("\nSortiert mit Comperator:");
		Collections.sort(l2, new LaengeComperator());
		for (PapierBlatt p : l2) {
			System.out.println(p.getFormat());
		}
		

	}

}
