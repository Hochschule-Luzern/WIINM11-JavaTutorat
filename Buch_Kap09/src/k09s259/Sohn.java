package k09s259;

public class Sohn extends Vater{

	  /** Eine oeffentliche Variable var */
	  public int var;
	  public int sohn;

	  /** Konstruktor */
	  public Sohn() {
	    var=2;
	    sohn = 20;
	  }

	  /** Ausgabe des Variableninhalts */
	  public void zeigeVar() {
	    System.out.println("SOHN:  "+var);
	  }
	  
	  public void zeigeSohn() {
		    System.out.println("SOHN:  "+sohn);
		  }
	  

}
