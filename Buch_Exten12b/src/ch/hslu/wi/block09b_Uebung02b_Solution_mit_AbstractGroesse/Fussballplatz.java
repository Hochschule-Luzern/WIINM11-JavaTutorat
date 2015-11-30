package ch.hslu.wi.block09b_Uebung02b_Solution_mit_AbstractGroesse;

public class Fussballplatz extends AbstractGroesse {//implements Groesse {

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

}
