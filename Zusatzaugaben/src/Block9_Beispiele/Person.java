package Block9_Beispiele;

public class Person {
	
	// Instanzvariablen
	private String name;
	private String firstName;
	public int age;

	// Konstruktor
	public Person(String ln, String fn) {
		name = ln;
		firstName = fn;
	}

	// Standardkonstruktor
	public Person() {
		this("Doe", "John");
	}
	
	// Abstrakte Methoden
	//public abstract printAll();
	
	// Getter Setter
	public void setName(String ln, String fn) {
		name = ln;
		firstName = fn;
	}

	// Methoden
	public String fullName() {
		return (name + " " + firstName);
	}
}