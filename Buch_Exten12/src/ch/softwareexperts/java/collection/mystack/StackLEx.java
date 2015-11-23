// Making a stack from a LinkedList.

package ch.softwareexperts.java.collection.mystack;
import java.util.*;

public class StackLEx{

  private LinkedList list = new LinkedList();

  public void push(Object v){
    // YOUR WORK
   
  }

  public Object top(){
    // YOUR WORK
     return new Object();  // diese Zeile muss korrigiert werden
  }

  public Object pop(){
    // YOUR WORK
     return new Object();  // diese Zeile muss korrigiert werden
  }

  public boolean isEmpty(){
    // YOUR WORK
     return true;          // diese Zeile muss korrigiert werden
  }

  public static void main(String args[]){

    StackLEx stack = new StackLEx();

    // Fill it up
    for(int i = 0; i < 10; i++) stack.push(Integer.toString(i));

    // Let them out
    while(!stack.isEmpty()) System.out.println(stack.pop());

  }
}

