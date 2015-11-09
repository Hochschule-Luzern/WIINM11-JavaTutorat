package k10s299;

import Prog1Tools.IOTools;

public class Excep2 {

  public static void main(String[] args) {
    int a=IOTools.readInteger("a=");
    int b=IOTools.readInteger("b=");
    try {
      System.out.println("a/b="+(a/b));
    }
    catch (ArithmeticException e) {
      System.out.println("Pfui -- Sie haben eine ArithmeticException "+
                         "ausgeloest!");
      System.out.println("Es gab folgendes Problem: "+e.getMessage());
      System.out.println("Seien Sie in Zukunft etwas vorsichtiger!");
    }
  }
}

