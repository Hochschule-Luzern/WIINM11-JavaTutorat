package auf_12_14;

import java.util.*;
public class ZiehungDerLottozahlen {
  
  public static void main(String[] args) {
    Set<Integer> zahlen = new HashSet<Integer>();
    while (zahlen.size() < 7) {
      zahlen.add(new Integer(1 + (int) (49 * Math.random())));
    }
    System.out.println("Gezogene Zahlen: " + zahlen);
  }
}
