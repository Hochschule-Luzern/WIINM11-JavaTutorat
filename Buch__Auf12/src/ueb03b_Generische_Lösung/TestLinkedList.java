package ueb03b_Generische_Lösung;



public class TestLinkedList {

	public static void main(String[] args) {
		System.out.println("Start von TestLinkedList");

		LinkedList<String> ll = new LinkedList<String>();

		String sFirst = "aa";
		String sSecond = "bb";
		String sThird = "cc";
		String sFourth = "dd";
		String sFifth = "ee";
		//String sSixth = "ff";
		//String sSeventh = "gg";
		ll.insertFirst(sFirst);
		ll.insertLast(sSecond);
		ll.insertLast(sThird);
		ll.insertLast(sFourth);
		ll.insertLast(sFifth);
		// ll.insertLast(sSixth);
		// ll.insertLast(sSeventh);
		// System.out.println(ll.getObject(4).info);
		ll.showList();
		ll.reverseList();
		System.out.println("Liste wird umgekehrt!");
		ll.showList();
		
		System.out.println("Ende von TestLinkedList");
	}
}
