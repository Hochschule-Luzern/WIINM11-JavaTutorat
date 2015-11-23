package auf_12_02;

import Prog1Tools.IOTools;

public class VokalBearbeitung {
        
  /** Zeichen, die es zu ersetzen gilt */
  private final static char[] TO_REPLACE = {
    'A','a','E','e','I','i','o','O','U','u'
  };
  
  /** Durch diese Werte werden die Zeichen ersetzt */
  private final static String[] REPLACEMENTS = {
    "","","","","II","ii","oo","OO","X","x"
  };
  
  /** Ersetzungs-Methode */
  public static String replace(String s) {
    StringBuffer sb = new StringBuffer();
    char[] c = s.toCharArray();
    for( int i = 0; i < c.length; i++) {
      boolean replaced = false;
      for( int j = 0; j < TO_REPLACE.length; j++)
        if (c[i] == TO_REPLACE[j]) {
          sb.append(REPLACEMENTS[j]);
          replaced = true;
          break;
        }
      if (!replaced)
        sb.append(c[i]);
    }
    return sb.toString();
  }
        
  public static void main (String[] args) {
    String line = IOTools.readLine("vorher: ");
    System.out.println("nachher: " + replace(line));
    
  }
}
