package ueb02d_Partielle_Lösung;

import ueb02a_Partielle_Lösung.LinkedList;

public class TestLinkedListEinElement {

	public static void main(String[] args) {
		System.out.println("Start von TestLinkedListEinElement");

		
		LinkedList ll = new LinkedList();
		ll.insertFirst("nur ein Element");
		
		ll.showList();

		ll.removeFirst();
		ll.insertFirst("noch ein 1. Element");
		ll.removeLast();                       
		ll.insertFirst("noch ein 2. Element");
		ll.insertFirst("noch ein 3. Element");
		ll.insertFirst("noch ein 4. Element");
		System.out.println("*************");
		
		ll.showList();
		
		LinkedList llnew = ll.reverseList();
		System.out.println("revrevrev");		
		llnew.showList();
		
		System.out.println("Ende von TestLinkedListEinElement");
	}

}
