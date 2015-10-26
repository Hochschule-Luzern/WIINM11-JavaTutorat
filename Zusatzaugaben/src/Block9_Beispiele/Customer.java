package Block9_Beispiele;

public class Customer extends AbstractCustomer {

	// Abstrakte Methoden implementieren
	@Override
	public String getCustomerName() {
		return this.fullName();
	}

}
