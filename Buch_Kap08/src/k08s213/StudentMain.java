package k08s213;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("k08s213: Klassenmethoden / Klassenvariablen");
		Student studi1 = Student.createStudent();
		Student studi2 = Student.createStudent();
		
		studi1.setName("Karla Karlsson");  // studi.name = "Karla Karlsson";		
		studi1.setNummer(12345);           // studi.nummer = 12345;

	System.out.println("Output: " + studi1);
		System.out.println("Output: " + studi2);
		System.out.println("Anzahl erzeugter Studierende: " + Student.getZaehler());
			
	}
}

