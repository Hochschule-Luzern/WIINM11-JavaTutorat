/*
 * "Grundkurs Programmieren in Java (6. Auflage, 2011)"
 * 2003-2011, Carl Hanser Verlag
 * Loesungsvorschlag zu Aufgabe 13.1 (Version 2.0)
 * (c) 2003-2011 D. Ratz, J. Scheffler, D. Seese, J. Wiesenberger
 *
 */

package studienfaecher;
public enum Fach {
  MATHEMATIKSTUDIUM, INFORMATIKSTUDIUM, ARCHITEKTURSTUDIUM, 
  WIRTSCHAFTLICHESSTUDIUM, BIOLOGIESTUDIUM, GESCHICHTSSTUDIUM, 
  GERMANISTIKSTUDIUM, POLITOLOGIESTUDIUM, PHYSIKSTUDIUM;

  public int regelstudienzeit() {
    switch (this) {
      case MATHEMATIKSTUDIUM:
      case INFORMATIKSTUDIUM:
      case ARCHITEKTURSTUDIUM:
        return 11;
      case WIRTSCHAFTLICHESSTUDIUM:
      case BIOLOGIESTUDIUM:
      case GESCHICHTSSTUDIUM:
        return 10;
      case GERMANISTIKSTUDIUM:
      case POLITOLOGIESTUDIUM:
      case PHYSIKSTUDIUM:
        return 13;
      default:
        return -1;
    }
  }
}
 
