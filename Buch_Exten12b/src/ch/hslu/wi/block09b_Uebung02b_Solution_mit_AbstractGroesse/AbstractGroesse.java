package ch.hslu.wi.block09b_Uebung02b_Solution_mit_AbstractGroesse;


public abstract class AbstractGroesse implements Groesse {

	public abstract int laenge();

	public abstract int hoehe();

	public abstract int breite();

	// Vergleichen auf der Grundlage der Grösse der Fläche
	public int compareTo(Groesse o) {

		int fo = o.breite() * o.laenge();		
		//aktuelles Objekt
		int fx = this.breite() * this.laenge();

		if( fo < fx ){
			return -1;
		}    
		if( fo > fx ){
			return  1;            
		}
		return 0;  
	}
}
