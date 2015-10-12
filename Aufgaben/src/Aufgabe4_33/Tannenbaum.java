package Aufgabe4_33;

import java.awt.print.Printable;

public class Tannenbaum {

	public static void main(String[] args) {
		
		int zeile = 5;
		// hier eingabe einf�gen mit Scanner
		
		int sterne = 1;
		int leerschlag = zeile-1;
		
		String[] array = new String[2];
		array[0] = "Hallo";
		array[1] = "Welt";
		
		for(String s : array){
			System.out.println(s);
		}
		
		for(int i = 0; i<array.length;i++){
			String s = array[i];
			System.out.println(s);
		}
		
		
		for(int i=1; i<=zeile;i++){
			
			// leerschl�ge ausgeben -> leerschlag * " "
			for(int k=1;k<=leerschlag;k++){
				System.out.print(" ");
			}
			
			// sterne ausgeben -> sterne * "*"
			for(int j=1; j<=sterne; j++){
				System.out.print("*");
			}			
			
			// sterne in 2er Schritte erh�hen
			sterne += 2;
			System.out.println();
			leerschlag--;	
		}
		
		// stamm leerschl�ge
		for(int i=1;i<zeile;i++){
			System.out.print(" ");
		}
		System.out.println("|");
		
	}

}
