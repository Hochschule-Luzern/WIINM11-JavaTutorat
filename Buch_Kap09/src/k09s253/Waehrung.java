package k09s253;

/** Diese Klasse symbolisiert eine beliebige Waehrung */
public abstract class Waehrung {

	/** Gibt den Wert des Objekts in US-Dollar zurueck */
	public abstract double dollarBetrag();

	
	/** Berechne 8 Prozent des im Feld gespeicherten Geldes 
	 *  ACHTUNG: Abstrakte Klassen können Implementation enthalten!!!!
	 *  
	 * @param geld
	 * @return
	 */
	
	public static double berechneSteuer(Waehrung[] geld) {
		double summe=0;  				// der Gesamtbetrag
		for (Waehrung w : geld){ 		// wird in einer Schleife
			summe+=w.dollarBetrag(); 	// summiert und anschliessend
		    }
		return summe*0.08; 				// mit 8% (=0.08) multipliziert
	}



	
	
	
}