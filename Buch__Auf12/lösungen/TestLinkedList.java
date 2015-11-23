package ueb01a;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello world");

		LinkedList ll = new LinkedList();

		String sFirst = "0";
		String sSecond = "1";
		String sThird = "2";
		String sFourth = "3";
		String sFifth = "4";
		String sSixth = "5";
		String sSeventh = "6";
		String sEigth = "7";
		String sNineth = "8";
		String sTenth = "9";
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
		ll.showList();
	}

}
