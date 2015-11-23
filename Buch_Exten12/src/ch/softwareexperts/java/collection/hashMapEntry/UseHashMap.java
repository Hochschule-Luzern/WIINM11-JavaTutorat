package ch.softwareexperts.java.collection.hashMapEntry;
import java.util.*;
import java.util.Map.Entry;

public class UseHashMap{
  public static void main(String[] args){
    HashMap<String, String> h = new HashMap<String, String>();
    //Some Aliases
    h.put("john","john.losinger@sb.de");
    h.put("ogi","adolf.ogi@trivadis.com");
    h.put("pascal","pascal@mathis.ch");
    h.put("pascal","pascal@hslu.ch");
    //Output
    Iterator<Map.Entry<String, String>> it = h.entrySet().iterator(); 
    while (it.hasNext()) {
      Map.Entry<String,String> entry = (Entry<String, String>)it.next();
      System.out.println((String)entry.getKey()+
         "-->"+(String)entry.getValue());
    }
  }
}
