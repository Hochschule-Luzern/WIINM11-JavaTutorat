package k08s213;

public class Student {

	private static int zaehler = 0;  // ??
	private String name;			 // ??
	private int nummer;				 // ??


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
		int alteNummer = this.nummer;   //this-Ref nicht unbedingt nötig!
		this.nummer = n;
		if (!validateNummer()) { // wenn neue Nummer ist nicht gueltig
			this.nummer = alteNummer;
		}
	}

	/** Pruefe die Matrikelnummer des Studenten auf ihre Gueltigkeit */
	public boolean validateNummer() {
		return (nummer >= 10000 && nummer <= 99999 && nummer % 2 != 0);  //return true==1 oder false==0
	}

	/** Gib eine textuelle Beschreibung dieses Studenten aus */
	public String toString() {
		return name + " (" + nummer + ")";
	}
	
	
	/**
	 * @return the zaehler
	 */
	public static int getZaehler() {
		return zaehler;
	}
	
	
	/** 
	 * Erzeugt ein neues Studentenobjekt 
	 */
	public static Student createStudent() {
		zaehler++; // erhoehe den Zaehler um eins
		return new Student();
	}
	
}
  