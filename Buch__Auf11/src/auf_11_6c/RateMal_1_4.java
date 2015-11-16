package auf_11_6c;

/*
 * "Grundkurs Programmieren in Java (6. Auflage, 2011)"
 * 2003-2011, Carl Hanser Verlag
 * Loesungsvorschlag zu Aufgabe 13.1 (Version 2.0)
 * (c) 2003-2011 D. Ratz, J. Scheffler, D. Seese, J. Wiesenberger
 *
 */

public class RateMal_1_4 {
  
  public static void ausgabe(Object[] eingabe) {
    System.out.print("Ausgabe: ");
    for(int i = 0; i < eingabe.length; i++)
      System.out.print(eingabe[i] + " ");
    System.out.println();
  }
  
  public static Comparable[] tueWas(Comparable[] eingabe) {
    eingabe = (Comparable[])eingabe.clone();
    for(int i = eingabe.length - 1; i > 0; i--)
      for(int j = 0; j < i; j++)
        if (eingabe[j].compareTo(eingabe[j+1]) > 0) {
          Comparable tmp = eingabe[j];
          eingabe[j] = eingabe[j+1];
          eingabe[j+1] = tmp;
        }
    return eingabe;
  }
  
  public static Integer box(int value) {
    return new Integer(value);
  }
  
  public static void main(String[] args) {
    ausgabe(tueWas(new Boolean[]{Boolean.TRUE,Boolean.FALSE}));
    ausgabe(tueWas(new String[]{"welt","hallo"}));
  }
}
