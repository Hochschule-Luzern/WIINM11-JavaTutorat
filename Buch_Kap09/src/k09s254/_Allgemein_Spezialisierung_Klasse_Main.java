package k09s254;

public class _Allgemein_Spezialisierung_Klasse_Main {

	
	public  static  void main (String[] args){
	
	AllgemeineKlasse a01 = new AllgemeineKlasse();
	AllgemeineKlasse a02 = new AllgemeineKlasse();
	AllgemeineKlasse a03 = new AllgemeineKlasse();
	
	a01.setAll_int(5);
	
	
	SpezielleKlasse s01 = new SpezielleKlasse();
	SpezielleKlasse s02 = new SpezielleKlasse();
	
	s01.spez_int = 115;
	s01.all_int = 105;
	
	System.out.println("nach s01.spez_int = 115:  "  + s01.spez_int);
	System.out.println("nach s01.all_int = 105:  "  + s01.all_int);
	a01 = s01;
	System.out.println("nach a01 = s01  ");
	System.out.println("a01.spez_int:  GEHT NICHT, weil a01 hat keine Variable a01.spez_int! ");
	//System.out.println("a01.spez_int:  "  + a01.spez_int);
	System.out.println("a01.all_int:  "  + a01.all_int);	
	
	//s02 = a03;   // funktioniert nicht, weil a03 nicht alle Attribute von s02  "füllen" könnte!!
	
	/* Kommentar wegnehmen => Class-Cast-Exception!
	   System.out.println("\n s02 = (SpezielleKlasse) a03 erzeugt während Laufzeit einen ClassCast-Exception");	
	   s02 = (SpezielleKlasse) a03;
	*/
	
	AllgemeineKlasse a04 = new SpezielleKlasse();
	// testen mit a04. 
	SpezielleKlasse s03 = (SpezielleKlasse)a04;
	// testen mit s03. 
	
	
	
	
	}
	
	
}
