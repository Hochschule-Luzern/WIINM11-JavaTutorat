package ch.softwareexperts.java.collection.EnumeratorUndVector;


import java.util.*;

public class EnumeratorUndVector {

  public static void main(String[] args) {

    Vector v = new Vector();

    v.addElement("first");
    v.addElement("second");
    v.insertElementAt("third",1);
    for(Enumeration el=v.elements(); el.hasMoreElements();)
    {System.out.println((String)el.nextElement());}
    
  }
}
