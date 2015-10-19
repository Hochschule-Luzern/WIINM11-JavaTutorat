package k08s226;

public class Super {

	/** Eine oeffentliche Instanzvariable */
	public String x = "vor Super-Konstruktor";

	/** Ein argumentloser Konstruktor */
	public Super() {
		System.out.println("Super-Konstruktor gestartet.");
		System.out.println("x = " + x);
		x = "nach Super-Konstruktor";
		System.out.println("Super-Konstruktor beendet.");
		System.out.println("x = " + x);
	}
 }