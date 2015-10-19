package k08s226;

public class Sub extends Super {

	  /** Eine weitere oeffentliche Instanzvariable */
	  public String y = "vor Sub-Konstruktor";

	  /** Ein argumentloser Konstruktor */
	  public Sub() {
	    System.out.println("Sub-Konstruktor gestartet.");
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
	    x = "nach Sub-Konstruktor";
	    y = "nach Sub-Konstruktor";
	    System.out.println("Sub-Konstruktor beendet.");
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
	  }
	}
