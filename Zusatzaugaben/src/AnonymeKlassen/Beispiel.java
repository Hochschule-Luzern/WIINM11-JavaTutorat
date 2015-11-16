package AnonymeKlassen;

public class Beispiel {

	public static void main(String[] args) {
		
		// Nicht Anonym
		KlasseA a = new KlasseA();
		KlasseB b = new KlasseB(a);
		// a steht hier immer noch zur Verf�gung
		
		// Anonym
		KlasseB b = new KlasseB(new KlasseA());
		// a steht nicht mehr zur Verf�gung

	}

}
