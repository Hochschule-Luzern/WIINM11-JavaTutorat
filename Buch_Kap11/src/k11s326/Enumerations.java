package k11s326;

import typen.Noten;
import static typen.Noten.*;
public class Enumerations {
  public static void main(String[] args) {
    for (Noten n : Noten.values())
      if (n.liegtAufSchwarzerTaste())
        System.out.println(n + " liegt auf einer schwarzen Taste");
      else
        System.out.println(n + " liegt auf einer weissen Taste");
  }
}
