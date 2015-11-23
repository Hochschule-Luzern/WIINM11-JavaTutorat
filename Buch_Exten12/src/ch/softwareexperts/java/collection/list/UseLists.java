package ch.softwareexperts.java.collection.list;
import java.util.*;

public class UseLists{

  static void fillList(List<String> list){
    for (int i = 0; i < 10; ++i) {list.add("" + i);}
    System.out.println(list.toString());
    list.remove(3);
    list.remove("5");
  }

  static void printList(List<String> list){
    for (int i=0;i<list.size();++i){System.out.println((String)list.get(i));}
    System.out.println("---");
  }

  public static void main(String[] args){
    //Create LinkedList
    LinkedList<String> list1 = new LinkedList<String>();
    fillList(list1);
    System.out.println("Ausgabe als LinkedList: ");
    printList(list1);

    //CreateArrayList
    ArrayList<String> list2 = new ArrayList<String>();
    fillList(list2);
    System.out.println("Ausgabe als ArrayList: ");    
    printList(list2);

    //Test removeAll
    list2.remove("0");
    list1.removeAll(list2);
    System.out.println("Rest in LinkedList: ");
    printList(list1);
  }
}