package k08s211;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("k08s211: Instanzmethoden - Erweiterte Funktionaliät - toString()-Methode");
		Student studi = new Student();
		
		studi.setName("Karla Karlsson");  // studi.name = "Karla Karlsson";		
		studi.setNummer(12345);           // studi.nummer = 12345;

		System.out.println("Output: " + studi.toString());
		// oder - genau gleicher Ouput!!!!!!!
		System.out.println("Output: " + studi);
		
	}
}

