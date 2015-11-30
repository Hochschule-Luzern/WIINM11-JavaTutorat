package ch.hslu.wi.block09b_Uebung03_Solution;

import java.util.Collections;
import java.util.LinkedList;


public class Groesse_Comparable_Main_Ueb03 {

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

		// Liste mit Papierbl�ttern, wird �ber deren compareTo Methode sortiert
		LinkedList<PapierBlatt> l2 = new LinkedList<PapierBlatt>();
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

	}

}
