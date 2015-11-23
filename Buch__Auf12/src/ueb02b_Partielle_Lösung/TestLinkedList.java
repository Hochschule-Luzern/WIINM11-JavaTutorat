package ueb02b_Partielle_Lösung;

import ueb02a_Partielle_Lösung.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		System.out.println("Start von TestLinkedList");

		LinkedList ll = new LinkedList();

		String sFirst = "aa";
		String sSecond = "bb";
		String sThird = "cc";
		String sFourth = "dd";
		String sFifth = "ee";
		String sSixth = "ff";
		//String sSeventh = "gg";
		ll.insertFirst(sFirst);
		ll.insertLast(sSecond);
		ll.insertLast(sThird);
		ll.insertLast(sFourth);
		ll.insertLast(sFifth);
	    ll.insertLast(sSixth);
		// ll.insertLast(sSeventh);
		System.out.println("Element an 2. Stelle: " + ll.getObject(1).getInfo());
		ll.showList();
		ll.reverseList();
		System.out.println("Liste wird umgekehrt!");
		ll.showList();
		
		System.out.println("Ende von TestLinkedList");
	}
}
