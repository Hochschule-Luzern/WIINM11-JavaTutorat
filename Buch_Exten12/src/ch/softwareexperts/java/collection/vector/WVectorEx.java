package ch.softwareexperts.java.collection.vector;
import java.util.*;

public class WVectorEx {

  public static void main(String[] args) throws Exception{

    Vector v = new Vector();

    // Hinzufügen von Elementen verschiedener Klassen in den Vektor
    Integer iI = new Integer(9);
    v.addElement(iI);
    System.out.println("Size is: "+v.size());

    Float fF = new Float(9.9f);
    v.addElement(fF);
    System.out.println("Size is: "+v.size());

    Double d=new Double(9.9d);
    v.addElement(d);
    System.out.println("Size is: "+v.size());

    TestObj to=new TestObj(7);
    v.addElement(to);
    System.out.println("Size is: "+v.size());

    v.insertElementAt("third",1);
    System.out.println("Size is: "+v.size());

    //Wahlfreier Zugriff auf alle Elemente (print)
    // YOUR WORK


    // Sequentieller Zugriff auf alle Elemente mit Enumeration (print)
    // YOUR WORK


    // Wahlfreier Zugriff mit Test auf Klasse:
    // Klasse soll ausgegeben werden  ('instanceof' verwenden!)
    // YOUR WORK
    
    
    
    // Ersetzen Sie das 3. Vektorelement mit einem
    // Integer-Wert von der Grösse '6'!
    // YOUR WORK
    
	// Geben Sie das 1., 3. und 5. Element im 
	// Vektor aus 
    // YOUR WORK    
    


  }
}
