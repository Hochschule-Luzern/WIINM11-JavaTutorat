package auf_12_04;

import java.util.Arrays;

public class Berechne {
  
  private final static String HILFE =
    "Anwendung: java Berechne <zahl1> +|-|*|/ <zahl2>";
  
  public static void main (String[] args) {
    
    // Stimmt die Zahl der Argumente?
    if (args.length != 3) {
      System.out.println(HILFE);
      return;
    }
    
    // Ist das erste Argument gueltig?
    double z1 = 0;
    try {
      z1 = Double.parseDouble(args[0]);
    }
    catch(NumberFormatException e) {
      System.out.println("zahl1 ungueltig");
      return;
    }
    
    // Ist das zweite Argument gueltig?
    args[1] = args[1].trim();
    if (!Arrays.asList(new String[]{"+","-","*","/"}).contains(args[1])) {
      System.out.println("operator ungueltig: " + args[1]);
      System.out.println(HILFE);
      return;
    }

    // Ist das dritte Argument gueltig?
    double z2 = 0;
    try {
      z2 = Double.parseDouble(args[2]);
    }
    catch(NumberFormatException e) {
      System.out.println("zahl2 ungueltig");
      return;
    }
    
    // Fuehre die Operation aus
    switch(args[1].charAt(0)) {
      case '+': System.out.println(z1 + z2);break;
      case '-': System.out.println(z1 - z2);break;
      case '*': System.out.println(z1 * z2);break;
      case '/': System.out.println(z1 / z2);break;
    }

  }
}
