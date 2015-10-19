package k08s203;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("k08s203: Zugriff auf public-Felder geht... ist aber verpöhnt!");

		
		Student studi = new Student();
		studi.name = "Karla Karlsson";
		studi.nummer = 12345;
		
		System.out.println("Die Studentin heisst: " + studi.name);
		System.out.println("und hat Matrikelnummer: " + studi.nummer);
	}
}

