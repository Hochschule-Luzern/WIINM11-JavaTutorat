package k08s218;

public class Student {
    
	public static final int MATHEMATIKSTUDIUM = 1;			// ??
	public static final int INFORMATIKSTUDIUM = 2;
	public static final int ARCHITEKTURSTUDIUM = 3;
	public static final int WIRTSCHAFTLICHESSTUDIUM = 4;
	public static final int BIOLOGIESTUDIUM = 5;
	public static final int GESCHICHTSSTUDIUM = 6;
	public static final int GERMANISTIKSTUDIUM = 7;
	public static final int POLITOLOGIESTUDIUM = 8;
	public static final int PHYSIKSTUDIUM = 9;
	
	
	private static int zaehler = 0;  // Klassenvariable
	private String name;			 // Instanzvariable
	private int nummer;				 // Instanzvariable
	private int fach;				 // Instanzvariable
	
	private Student(){				 // Standard-Konstruktor, der Speicherplatz vom OS verlangt 
		Student.zaehler++;			 // und Instanz- und Klassenvariablen auf die "Grundwerte"
	};				 				 // oder spezielle gew�nschte Anfangswerte setzt.
									 // Ein Konstruktor "INITIALISIERT" ein Objekt mit Werten
									 // hier wird z.B. die Klassenvariable "zaehler" um eins erh�ht!
		
	/** 
	 * Erzeugt ein neues Studentenobjekt 
	 */
	public static Student createStudent() {
		return new Student();
	}
	
	
	
	
	public int getFach() {
	return fach;
	}

	public void setFach(int fach) {
	this.fach = fach;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNummer() {
		return nummer;
	}

	/** Setze die Matrikelnummer des Studenten auf einen best. Wert */
	public void setNummer(int n) {
		int alteNummer = this.nummer;   //this-Ref nicht unbedingt n�tig!
		this.nummer = n;
		if (!validateNummer()) { // wenn neue Nummer ist nicht gueltig
			this.nummer = alteNummer;
		}
	}

	/** Pruefe die Matrikelnummer des Studenten auf ihre Gueltigkeit */
	public boolean validateNummer() {
		return (nummer >= 10000 && nummer <= 99999 && nummer % 2 != 0);  //return true==1 oder false==0
	}

	public String toString() {
		String res = name + " (" + nummer + ") -> ";
		switch(fach) {
		case MATHEMATIKSTUDIUM:
			return res + " ein Mathestudent " +
			"(oder auch zwei, oder drei).";
		case INFORMATIKSTUDIUM:
			return res + " ein Informatikstudent.";
		case ARCHITEKTURSTUDIUM:
			return res + " angehender Architekt.";
		case WIRTSCHAFTLICHESSTUDIUM:
			return res + " ein Wirtschaftswissenschaftler.";
		case BIOLOGIESTUDIUM:
			return res + " Biologie ist seine Staerke.";
		case GESCHICHTSSTUDIUM:
			return res + " sollte Geschichte nicht mit Geschichten " +
			"verwechseln.";
		case GERMANISTIKSTUDIUM:
			return res + " wird einmal Germanist gewesen tun sein.";
		case POLITOLOGIESTUDIUM:
			return res + " kommt bestimmt einmal in den Bundestag.";
		case PHYSIKSTUDIUM:
			return res + " studiert schon relativ lange Physik.";
		default:
			return res + " keine Ahnung, was der Mann studiert.";
		}
	}	

	/**
	 * @return the zaehler
	 */
	public static int getZaehler() {
		return zaehler;
	}

}
  