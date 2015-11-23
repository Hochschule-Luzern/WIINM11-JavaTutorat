package ch.softwareexperts.java.collection.comparable;

public class ComparableExample {

	public static void main(String[] args) {
		
		/** Die Klasse String implementiert das Interface Comparable!
		 */
		
		String a = "Halla";
		String b = "Halli";
		int res;
		
		res = a.compareTo(b);
		
		System.out.println("Resultat: " + res);
		
		
	}
}

