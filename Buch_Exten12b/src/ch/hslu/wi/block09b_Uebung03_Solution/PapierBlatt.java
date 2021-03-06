package ch.hslu.wi.block09b_Uebung03_Solution;

public class PapierBlatt implements Groesse, java.lang.Comparable<Groesse> {

	private String format;
	private int hoehe;
	private int laenge;
	private int breite;
	
	@Override
	public int compareTo(Groesse o) {
		
		double fx = breite * laenge;
		double fo = o.breite() * o.laenge();
		
		if (fx > fo)
			return 1;
		if (fx < fo)
			return -1;
		return 0;
	}

	/*
	public PapierBlatt() {
	}
    */
	
	public PapierBlatt(String format) {
		//super();
		this.format = format;
		int ausdruck =  Integer.parseInt(format.substring(1, format.length()));
		switch (ausdruck)
		{
		case 0: laenge = 1189;
				breite = 841;
				hoehe  = 0;
				break;
		case 1: laenge = 842;
				breite = 594;
				hoehe  = 0;	
				break;
		case 2: laenge = 594;
				breite = 420;
				hoehe  = 0;	
				break;
		case 3: laenge = 420;
				breite = 297;
				hoehe  = 0;	
				break;
		case 4: laenge = 297;
				breite = 210;
				hoehe  = 0;	
				break;
		case 5: laenge = 210;
				breite = 148;
				hoehe  = 0;	
				break;
		case 6: laenge = 148;
				breite = 105;
				hoehe  = 0;	
				break;
		case 7: laenge = 105;
				breite = 74;
				hoehe  = 0;	
				break;
		case 8: laenge = 74;
				breite = 52;
				hoehe  = 0;
				break;
		case 9: laenge = 52;
				breite = 37;
				hoehe  = 0;	
				break;
		case 10: laenge = 37;
				breite = 26;
				hoehe  = 0;
				break;
		 default: laenge = 0;
				 breite = 0;
				 hoehe  = 0;					
		}
	}

	
	
	@Override
	public int laenge() {
		return this.laenge;
	}

	@Override
	public int hoehe() {
		return hoehe;
	}

	@Override
	public int breite() {
		return this.breite;
	}


	public String getFormat() {
		return format;
	}
	
	
}
