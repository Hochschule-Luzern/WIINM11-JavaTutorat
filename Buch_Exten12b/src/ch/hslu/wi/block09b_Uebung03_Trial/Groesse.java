package ch.hslu.wi.block09b_Uebung03_Trial;

public interface Groesse extends Comparable<Groesse> {
	
	static final int dim = 3;
	
	public int laenge();
	
	public int hoehe();
	
	public int breite();

	int compareTo(Groesse o);


}