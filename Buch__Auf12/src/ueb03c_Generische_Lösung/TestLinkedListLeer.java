package ueb03c_Generische_Lösung;



public class TestLinkedListLeer {

	public static void main(String[] args) {
		System.out.println("Start von TestLinkedListLeer");
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.showList();

		ll.removeFirst();
		ll.removeLast();
		ll.reverseList();
		
		ll.showList();
		
		System.out.println("Ende von TestLinkedListLeer");
	}

}
