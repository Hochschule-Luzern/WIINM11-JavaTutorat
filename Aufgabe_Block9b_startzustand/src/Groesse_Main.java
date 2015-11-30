import java.util.LinkedList;
import java.util.List;

public class Groesse_Main {
	// statische Methode um mit Interface Grösse arbeiten zu können.
	public static int grundflaeche(Groesse g) {
		return g.breite() * g.laenge();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// einige Grössenobjekte erstllen
		Groesse f1 = new Fussballplatz();
		Groesse a3 = new PapierBlatt("A3");
		System.out.println("a3.laenge" + a3.laenge());
		Groesse a4 = new PapierBlatt("A4");
		System.out.println("a4.laenge" + a4.laenge());
		Groesse a5 = new PapierBlatt("A5");

		// Ausgabe der Fläche der erstellten "Grössen"-Objekte / - Interfaces
		System.out.println("Fläche von f1 in mm^2: " + grundflaeche(f1));
		System.out.println("Fläche von A3 in mm^2: " + grundflaeche(a3));
		System.out.println("Fläche von A4 in mm^2: " + grundflaeche(a4));
		System.out.println("Fläche von A5 in mm^2: " + grundflaeche(a5));
		// Liste mit "Grössen"-Objekten erstellen und abfüllen
		List<Groesse> l2 = new LinkedList<Groesse>();
		l2.add(a5);
		l2.add(a4);
		l2.add(a3);
		l2.add(a4);
		l2.add(f1);
		// zur Ausgabe beigefügten "Grössen"-Objekte / -Interfaces
		for (Groesse it : l2) {
			System.out.println("Länge: " + it.laenge() + " x Breite: "
					+ it.breite());
		}
		// Berechnung der Gesamtfläche der in der Liste
		// gespeicherten "Grössen"-Objekten
		double summe = 0;
		for (int i = 0; i < l2.size(); i++) { /* Groesse it: l2 */
			summe = summe + grundflaeche(l2.get(i));
		}
		/*
		 * Kürzer mit neuer "foreach" - Art: double summe1 = 0; for (Groesse it:
		 * l2){ summe1 = summe1 + grundflaeche(it); }
		 * System.out.println("Summe: " + summe);
		 */
		System.out.println("Die Gesamtfläche beträgt: " + summe);
	}
}