package k08s218;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("k08s218: Standard-Konstruktor");
		Student studi1 = Student.createStudent();
		// Student studi2 = new Student();           // WARUM geht das nicht mehr?
		
		studi1.setName("Karla Karlsson");  // studi.name = "Karla Karlsson";		
		studi1.setNummer(12345);           // studi.nummer = 12345;
		studi1.setFach(Student.INFORMATIKSTUDIUM);	

		System.out.println("Output: " + studi1);
		System.out.println("Anzahl erzeugter Studierende: " + Student.getZaehler());
			
	}
}

