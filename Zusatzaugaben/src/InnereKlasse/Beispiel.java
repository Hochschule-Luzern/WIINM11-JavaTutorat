package InnereKlasse;

public class Beispiel {

	public static void main(String[] args) {
		
		// Beispiel externer Aufruf einer inneren Klasse
		KlasseB b = new KlasseB((new KlasseB()).new KlasseA());

	}

}
