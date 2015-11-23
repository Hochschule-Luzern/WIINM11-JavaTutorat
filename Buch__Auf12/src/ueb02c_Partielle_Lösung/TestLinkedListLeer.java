package ueb02c_Partielle_Lösung;

import ueb02a_Partielle_Lösung.LinkedList;

public class TestLinkedListLeer {

	public static void main(String[] args) {
		System.out.println("Start von TestLinkedListLeer");
		
		LinkedList ll = new LinkedList();
		
		ll.showList();

		ll.removeFirst();
		ll.removeLast();
		ll.reverseList();
		
		ll.showList();
		
		System.out.println("Ende von TestLinkedListLeer");
	}

}
