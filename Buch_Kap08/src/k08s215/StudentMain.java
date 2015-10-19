package k08s215;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("k08s215: Klassenkonstanten");
		Student studi1 = Student.createStudent();
		Student studi2 = Student.createStudent();
		
		studi1.setName("Karla Karlsson");  // studi.name = "Karla Karlsson";		
		studi1.setNummer(12345);           // studi.nummer = 12345;
		studi1.setFach(Student.INFORMATIKSTUDIUM);
		
		// Aufgabe: ergänzen Sie die toString() Methode, damit eine saubere 
		//          Ausgabe auf dem Bildschirm gemacht wird mit Studienart!
		
		
		
		System.out.println("Output: " + studi1);
		System.out.println("Output: " + studi2);
		System.out.println("Anzahl erzeugter Studierende: " + Student.getZaehler());
			
	}
}

