package auf_12_15;

import Prog1Tools.IOTools;
import java.util.*;
public class Sieb {
  public static void main (String[] args) {
    int n = IOTools.readInteger("Suche nach Primzahlen zwischen 2 und ");
    Set<Integer> t = new TreeSet<Integer>();
    for (int i=2; i<=n; i++)
      t.add(new Integer(i));  // alle Werte einfuegen
    Set<Integer> s = new TreeSet<Integer>();    // leere Menge 

    int v;

    int p = 2;
    do {
      v = 2 * p;
      while (v <= n) {
        s.add(new Integer(v));
        v = v + p;
      }
      if (p == 2) {
        p = 3;
      }
      else {
        do {
          p = p + 2;
        } while (s.contains(new Integer(p)));
      }
    } while (p * p <= n);
    
    t.removeAll(s);

    int anz = 0;
    for (Iterator<Integer> i = t.iterator(); i.hasNext(); ) {
      System.out.print(i.next() + " ");
      anz++;
      if ((anz % 10) == 0) 
        System.out.println();
    }
    System.out.println();
  }
}
