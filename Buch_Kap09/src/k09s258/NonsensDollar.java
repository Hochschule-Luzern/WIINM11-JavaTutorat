package k09s258;

public class NonsensDollar extends USDollar {

	/** Uebernehme den Konstruktor der Superklasse unveraendert. */
	public NonsensDollar(double wert) {
		super(wert);
	}

	/** Gib beim Dollarbetrag etwas vollkommen UNSINNIGES aus */
	public double dollarBetrag() {
		return Math.random();
	}

	/** Gib den tatsaechlichen Dollarbetrag aus */
	public double jetztMalImErnst() {
	return super.dollarBetrag();
	}
	
	
	
	
	
}
