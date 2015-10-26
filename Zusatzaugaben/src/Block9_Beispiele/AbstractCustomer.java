package Block9_Beispiele;

public abstract class AbstractCustomer extends Person implements Speek{

	// Klassenspezifische Instanzvariablen
	private String customerId;
	
	// Methode aus dem Interface
	@Override
	public String tellName() {
		return ("Hi, I'am " + this.fullName());
	}
	
	// zust�tzliche Getter Setter
	public String getCustomerId() {
		return customerId;
	}
	
	// Abstrakte Methode
	public abstract String getCustomerName();
	
	// zus�tzliche Methode
	public String printAll() {
		return (fullName() + " " + customerId + " " + age);
	}
}
