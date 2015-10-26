package k09s258;

import k09s252.USDollar;
import k09s252.Yen;

public class _Super_Referenz_Main {
	
	
	/**
	 * Main-Programm gemäss der Beschreibung S. 258
	 * @param args
	 */
	public static void main(String[] args){
	
	USDollar usd = new USDollar(1.00);
	NonsensDollar nd01 = new NonsensDollar(1.0);
	NonsensDollar nd02 = new NonsensDollar(1.0);
		
	System.out.println("Der Wert eines USDollars ist " + usd.dollarBetrag() + " $");
	//System.out.printf("Der Wert des Hotel-Safe's in Tokyo: %.2f $", saveInhalt.dollarBetrag());
	System.out.println("Der Wert von nd01: " + nd01.dollarBetrag() + " $");
	System.out.println("Der Wert von nd02: " + nd02.dollarBetrag() + " $");	
	
	System.out.println("...und jetzt im Ernst: ");
	System.out.println("Der Wert von nd01: " + nd01.jetztMalImErnst() + " $");
	System.out.println("Der Wert von nd02: " + nd02.jetztMalImErnst() + " $");	
	
	
	}
	
	

}
