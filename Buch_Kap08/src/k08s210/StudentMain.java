package k08s210;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("k08s210: Instanzmethoden - Validierung von Eingaben");
		Student studi = new Student();
		
		studi.setName("Karla Karlsson");  // studi.name = "Karla Karlsson";		
		studi.setNummer(12345);           // studi.nummer = 12345;

		// für Testzwecke:
	//	studi.setNummer(123456);           // diese Matrikelnummer ist falsch!
		
		System.out.println("Die Studentin heisst: " + studi.getName());
		System.out.println("und hat Matrikelnummer: " + studi.getNummer());
	}
}

