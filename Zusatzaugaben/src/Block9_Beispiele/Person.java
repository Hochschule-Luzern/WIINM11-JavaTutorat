package Block9_Beispiele;

public class Person {
	
	// Instanzvariablen
	private String name;
	private String firstName;
	public int age;
	protected int birthyear;
	
	// Konstruktor
	public Person(String ln, String fn) {
		name = ln;
		firstName = fn;
	}

	// Standardkonstruktor
	public Person() {
		this("Doe", "John");
	}
		
	// Getter Setter
	public void setName(String ln, String fn) {
		name = ln;
		firstName = fn;
	}

	// Methoden
	public String fullName() {
		return (firstName + " " + name);
	}
}