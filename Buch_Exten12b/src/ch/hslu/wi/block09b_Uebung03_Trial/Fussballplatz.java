package ch.hslu.wi.block09b_Uebung03_Trial;

public class Fussballplatz implements Groesse{

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
	
	//public class Fussballplatz implements Groesse, Comparable<Groesse> {
	
	
	@Override
	public int compareTo(Groesse o) {
		
		int fo = o.breite() * o.laenge();		
		//aktuelles Objekt
		int fx = this.breite * this.laenge;
        
	    if( fo < fx ){
	        return -1;
	    }    
	    if( fo > fx ){
	        return  1;            
		}
	    return 0;  
	}
	
	

}
