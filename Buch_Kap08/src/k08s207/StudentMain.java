package k08s207;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("k08s207");
		Student studi = new Student();
		
		studi.setName("Karla Karlsson");  // studi.name = "Karla Karlsson";		
		studi.setNummer(12345);           // studi.nummer = 12345;
		
		System.out.println("Die Studentin heisst: " + studi.getName());
		System.out.println("und hat Matrikelnummer: " + studi.getNummer());
	}
}

