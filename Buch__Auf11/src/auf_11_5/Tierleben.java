package auf_11_5;

/*
 * "Grundkurs Programmieren in Java (6. Auflage, 2011)"
 * 2003-2011, Carl Hanser Verlag
 * Loesungsvorschlag zu Aufgabe 13.1 (Version 2.0)
 * (c) 2003-2011 D. Ratz, J. Scheffler, D. Seese, J. Wiesenberger
 *
 */

interface Tier {
}
interface Haustier extends Tier {
}
interface Wildtier extends Tier {
}
class Katze implements Tier {
	public String toString(){return getClass().getName();}
}
class Hauskatze extends Katze implements Haustier {
}
class Wildkatze extends Katze implements Wildtier {
}
public class Tierleben {
	/*
  public static void gibAus(Object tier) {
    System.out.println("Objekt: " + tier);
  }
	 */
	/*
  public static void gibAus(Katze tier) {
    System.out.println("Katze: " + tier);    
  }
	 */
	
	public static <T> void gibAus(T tier) {
		System.out.println("Unbekannt: " + tier);
	}
	public static <T extends Tier> void gibAus(T tier) {
		System.out.println("Tier: " + tier);    
	}
	public static <T extends Haustier> void gibAus(T tier) {
		System.out.println("Haustier: " + tier);    
	}
	public static void main(String... args) {
		gibAus("Amoebe");
		gibAus(new Katze());
		gibAus(new Hauskatze());
		gibAus(new Wildkatze());
	}
}
