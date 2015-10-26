package Bruch_Uebung;

/** Start-Programm für die Klasse Bruch
 *  Erzeugt 4 Objekte (b1, b2, b3, b4) 
 *  und eine "leere" Referenzvariable (=Objektvariable) b5
 */
public class _BruchMain {
	
    public static void main(String[] args) {
    	Bruch b1 = new Bruch(1,2);
    	Bruch b2 = new Bruch(3,4);
    	Bruch b3 = new Bruch(8,7);
    	Bruch b4 = new Bruch(4,5);
    	Bruch b5;            // Erklärung:  Nur Referenzvariable wird erzeugt, mit Inhalt ???
    	
    	//b1.add(b2);
    	//b5 = b1;
    	b5 = b1.add(b2);  // gleicher Effekt wie die 2 Zeilen oben?   
    	
    	System.out.println("Resultat: b5 = " + b5.print());
    	System.out.println("b1 ist jetzt: " + b1.print());
    	System.out.println("b2 ist jetzt: " + b2.print());
    	
    	/*  Kommentarzeile wegnehmen und entsprechend
    	 *  notwendige Methoden noch programmieren!
    	 
    	Bruch b6;
    	b6 = b3.mult(b1);
    	System.out.println("Resultat: b6 = " + b6.print());
    	 
    	Bruch b7;
    	b7 = b3.div(b4);
    	System.out.println("Resultat: b7 = " + b7.print());
     	 
    	// etwas anspruchsvoller: 
    	System.out.println("Ungekürzt b5 = " + b5.print());
    	b5 = b5.kuerze();       // aus 10/8 sollte 5/4 herauskommen! 
    	System.out.println("Gekürzt b5 = " + b5.print()); 
   	 
    	 */
    }   
}
