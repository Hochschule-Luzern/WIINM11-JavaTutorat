package ueb02c_Partielle_L�sung;

import ueb02a_Partielle_L�sung.LinkedList;

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
