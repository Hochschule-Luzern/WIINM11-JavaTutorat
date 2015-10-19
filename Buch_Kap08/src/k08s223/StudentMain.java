package k08s223;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("k08s223: Statische Initialisierer");
		Student studi1 = new Student(1995);
		// oder
	//	Student studi2 = Student.createStudent(1995);
		
		studi1.setName("Karla Karlsson");  // studi.name = "Karla Karlsson";		
		studi1.setNummer(12345);           // studi.nummer = 12345;
		studi1.setFach(Student.INFORMATIKSTUDIUM);	

		System.out.println("Output: " + studi1);
		System.out.println("Output: " + Student.PHANTOM);
		System.out.println("Anzahl erzeugter Studierende: " + Student.getZaehler());
			
	}
}

