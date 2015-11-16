package auf_11_1;

import studienfaecher.Fach;

/** Diese Klasse simuliert einen Studenten */
public class Student {


  

  
  /* =========
     VARIABLEN
     =========
   */

  /** Zaehlt die Anzahl der erzeugten Studentenobjekte */
  private static int zaehler = 0;

  /** Der Name des Studenten */
  private String name;

  /** Die Matrikelnummer des Studenten */
  private int nummer;

  /** Studienfach des Studenten */
  private Fach fach;






  /* =========
     METHODEN
     =========
   */

  /** Gib den Namen des Studenten als String zurueck */
  public String getName() {
    return this.name;
  }

  
  /** Setze den Namen des Studenten auf einen bestimmten Wert */
  public void setName(String name) {
    this.name = name;
  }

  
  /** Gib die Matrikelnummer des Studenten als Integer zurueck */
  public int getNummer() {
    return nummer;
  }

  
  /** Setze die Matrikelnummer des Studenten auf einen bestimmten Wert */
  public void setNummer(int n) {
    int alteNummer = nummer;
    nummer = n;
    if (!validateNummer()) { // neue Nummer ist nicht gueltig
      nummer = alteNummer;
    }
  }

  
  /** Gib das Studienfach des Studenten als Integer zurueck */
  public Fach getFach() {
    return fach;
  }

  
  /** Setze das Studienfach des Studenten auf einen bestimmten
      Wert */
  public void setFach(Fach fach) {
    this.fach = fach;
  }


  /** Pruefe die Matrikelnummer des Studenten
      auf ihre Gueltigkeit */
  public boolean validateNummer() {
    return
      (nummer >= 10000 && nummer <= 99999 && nummer % 2 != 0);
  }

  
  /** Gib eine textuelle Beschreibung dieses Studenten aus */
  public String toString() {
    String res = name + " (" + nummer + ")\n";
    switch(fach) {
      case MATHEMATIKSTUDIUM:
        return res + "  ein Mathestudent " +
                     "(oder auch zwei, oder drei).";
      case INFORMATIKSTUDIUM:
        return res + "  ein Informatikstudent.";
      case ARCHITEKTURSTUDIUM:
        return res + "  angehender Architekt.";
      case WIRTSCHAFTLICHESSTUDIUM:
        return res + "  ein Wirtschaftswissenschaftler.";
      case BIOLOGIESTUDIUM:
        return res + "  Biologie ist seine Staerke.";
      case GESCHICHTSSTUDIUM:
        return res + "   sollte Geschichte nicht mit Geschichten " +
                     "verwechseln.";
      case GERMANISTIKSTUDIUM:
        return res + "  wird einmal Germanist gewesen tun sein.";
      case POLITOLOGIESTUDIUM:
        return res + "  kommt bestimmt einmal in den Bundestag.";
      case PHYSIKSTUDIUM:
        return res + "  studiert schon relativ lange Physik.";
      default:
        return res + "  keine Ahnung, was der Mann studiert.";
    }
  }

  
  /** Gib die Zahl der erzeugten Studentenobjekte zurueck */
  public static int getZaehler() {
    return zaehler;
  }

  
  /** Erzeugt ein neues Studentenobjekt */
  public static Student createStudent() {
    zaehler++; // erhoehe den Zaehler
    return new Student();
  }

}
  
