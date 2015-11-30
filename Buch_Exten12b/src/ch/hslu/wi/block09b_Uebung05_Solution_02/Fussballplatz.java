package ch.hslu.wi.block09b_Uebung05_Solution_02;

import ch.hslu.wi.block09b_Uebung02a_Solution.Groesse;

public class Fussballplatz implements Groesse {

	private int laenge;
	private int breite;

	public Fussballplatz() {
		laenge = 10500;
		breite = 7000;
	}

	@Override
	public int laenge() {
		return laenge;
	}

	@Override
	public int hoehe() {
		return 0;
	}

	@Override
	public int breite() {
		return breite;
	}
	
	@Override
	public int compareTo(Groesse o) {
		
		int fo = o.breite() * o.laenge();		
		//aktuelles Objekt
		int fx = this.breite() * this.laenge();
        
	    if( fo < fx ){
	        return 1;
	    }    
	    if( fo > fx ){
	        return  -1;            
		}
	    return 0;  
	}
	

}
