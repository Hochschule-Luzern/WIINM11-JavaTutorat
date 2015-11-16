package auf_11_6b;

/*
 * "Grundkurs Programmieren in Java (6. Auflage, 2011)"
 * 2003-2011, Carl Hanser Verlag
 * Loesungsvorschlag zu Aufgabe 13.1 (Version 2.0)
 * (c) 2003-2011 D. Ratz, J. Scheffler, D. Seese, J. Wiesenberger
 *
 */

public class RateMalB {
  
  public static <T> void ausgabe(T... eingabe) {
    System.out.print("Ausgabe: ");
    for(Object o : eingabe) 
      System.out.print(o + " ");
    System.out.println();
  }
  
  public static <T extends Comparable<T>> T[] tueWas(T... eingabe) {
    eingabe = eingabe.clone();
    for(int i = eingabe.length - 1; i > 0; i--)
      for(int j = 0; j < i; j++)
        if (eingabe[j].compareTo(eingabe[j+1]) > 0) {
          T tmp = eingabe[j];
          eingabe[j] = eingabe[j+1];
          eingabe[j+1] = tmp;
        }
    return eingabe;
  }
  
  public static void main(String[] args) {
    ausgabe(tueWas(Boolean.TRUE,Boolean.FALSE));
    ausgabe(tueWas("welt","schoene","du","hallo"));
  }
}
