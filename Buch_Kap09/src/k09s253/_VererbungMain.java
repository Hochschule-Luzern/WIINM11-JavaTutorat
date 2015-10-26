package k09s253;

public class _VererbungMain {

	public static void main(String[] args) {
		
		// sonst stimmt die Yen-Umwandlung nicht!
		Yen.setKurs(1.0/130	);	
		
		Waehrung[] Geld = new Waehrung[3];
		Geld[0] = new USDollar(2500);
		Geld[1] = new Yen(2000000); 
		Geld[2] = new USDollar(20);
		
		double steuer = USDollar.berechneSteuer(Geld);
		// dito!!
		//double steuer = Yen.berechneSteuer(Geld);
				
		System.out.printf("Der Steuerbetrag auf das Arrays 'Geld' ist: %.2f $", steuer);
	}	

}
