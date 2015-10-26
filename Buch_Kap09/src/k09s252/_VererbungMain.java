package k09s252;

public class _VererbungMain {

	public static void main(String[] args) {
		
		USDollar usd = new USDollar(1.00);
		Yen saveInhalt = new Yen(2000000);
		Yen.setKurs(1.0/130	);
		
		System.out.println("Der Wert eines USDollars ist " + usd.dollarBetrag() + " $");
		System.out.printf("Der Wert des Hotel-Safe's in Tokyo: %.2f $", saveInhalt.dollarBetrag());
	}	

}
