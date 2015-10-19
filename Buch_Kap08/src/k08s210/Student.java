package k08s210;

public class Student {

	private String name;
	private int nummer;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNummer() {
		return nummer;
	}
	/*
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
    */
	
	/** Setze die Matrikelnummer des Studenten auf einen best. Wert */
	public void setNummer(int n) {
		int alteNummer = this.nummer;   //this-Ref nicht unbedingt nötig!
		this.nummer = n;
		if (!validateNummer()) { // wenn neue Nummer nicht gueltig ist
			System.out.println("Validierung der Matrikelnummer: False");
			System.out.println("this.nummer: " + this.nummer);
			System.out.println("formaler Parameter n: " + n + "\n");
			this.nummer = alteNummer;
		}
		else{
		System.out.println("Validierung der Matrikelnummer: True");
		System.out.println("this.nummer: " + this.nummer);
		System.out.println("formaler Parameter n: " + n + "\n");
		}

		
		
	}



	/** Pruefe die Matrikelnummer des Studenten auf ihre Gueltigkeit */
	public boolean validateNummer() {
		return (nummer >= 10000 && nummer <= 99999 && nummer % 2 != 0);  //return true==1 oder false==0
	}

	
	
}
  