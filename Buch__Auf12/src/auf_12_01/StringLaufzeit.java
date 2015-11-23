package auf_12_01;

import Prog1Tools.*;
public class StringLaufzeit {
  public static void main (String[] args) {
    int n = IOTools.readInteger("Anzahl der Schleifendurchlaeufe: ");

    System.out.println();

    System.out.println(n + " mal Operator + fuer String ...");
    String str = "";
    for (int i=0; i<n; i++) 
      str = str + "x";
    System.out.println("... beendet");

    System.out.println();
        
    System.out.println(n + 
                       " mal Methode append fuer StringBuffer ...");
    StringBuffer buf = new StringBuffer("");
    for (int i=0; i<n; i++) 
      buf = buf.append("x");
    System.out.println("... beendet");
  }
}

