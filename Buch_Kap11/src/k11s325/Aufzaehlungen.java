package k11s325;

import static typen.Jahreszeit.*;
import typen.Jahreszeit;

public class Aufzaehlungen {
  public static void main(String[] args) {
    Jahreszeit x = HERBST;
    System.out.println(x);
    
    for (Jahreszeit jz : Jahreszeit.values())
      System.out.println(jz + " hat den Wert " + jz.ordinal());
  }
}
