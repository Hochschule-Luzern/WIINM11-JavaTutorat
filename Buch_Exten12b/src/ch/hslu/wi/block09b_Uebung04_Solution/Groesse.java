package ch.hslu.wi.block09b_Uebung04_Solution;

public interface Groesse {
	
	static final int dim = 3;
	
	public int laenge();
	
	public int hoehe();
	
	public int breite();

	public int compareTo(Groesse s1);

}