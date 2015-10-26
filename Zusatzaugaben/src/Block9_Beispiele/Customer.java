package Block9_Beispiele;

public class Customer extends Person implements Speek{

	// Klassenspezifische Instanzvariablen
	private String customerId;
	
	// Methode aus dem Interface
	@Override
	public String tellName() {
		return ("Hi, I'am " + this.fullName());
	}
	
	// zustätzliche Getter Setter
	public String getCustomerId() {
		return customerId;
	}
	
	// zusätzliche Methode
	public String printAll() {
		return (fullName() + " " + customerId + " " + age);
	}
}
