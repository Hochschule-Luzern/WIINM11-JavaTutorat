package k10s321;
 
import Prog1Tools.IOTools;
@SuppressWarnings("restriction")

public class AssertionTest {

  public static double kehrwert (double x) {
    assert x != 0 : "Wrong! divided by 0 - Never do it!";
    return 1/x;
  }


public static void main (String[] summand) {
    double x = IOTools.readDouble("x = ");
//    System.out.println(kehrwert(x));
   
    try {
      System.out.println(kehrwert(x));
    }
    catch (AssertionError e) {
      System.out.println (e.getMessage());
    }
    
  }
}
