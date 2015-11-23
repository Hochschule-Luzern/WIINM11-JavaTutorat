package ueb01a;

public class LinkedList {

	private Node head, tail;
	private int length = 0;

	public LinkedList() {
		head = null;
		tail = null;
	}

	/**
	 * Ist bereits ein Objekt in der Liste (im head)?
	 * 
	 * @return boolean
	 * 
	 * */
	private boolean isEmpty() {
		return head == null;
	}

	/**
	 * Ist die Liste so lange wie der Index?
	 * 
	 * @return boolean
	 * 
	 * */
	private boolean isIndexInRange(int index) {
		if ((index <= length) && !isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * First - Handling
	 */
	/**
	 * Fügt ein Objekt (x) an erster Stelle hinzu
	 * 
	 * @param x
	 */
	public void insertFirst(Object x) {
		if (isEmpty()) {
			// wenn noch kein Objekt vorhanden ist, dann mach eines.
			// Zusätzlich sind head und tail die selben Objekte
			head = new Node(x);
			tail = head;
			tail.next = null;
			length++;
		} else {
			// wenn bereits mindestens ein Objekt in der Liste ist, wird eines
			// am Anfang hinzugefügt.
			// der neue head ist nun das neue Node
			Node newNode = new Node(x);
			newNode.next = head;
			head = newNode;
			length++;
		}
	}

	/*
	 * Last - Handling
	 */
	/**
	 * Fügt ein Objekt (x) an letzter Stelle hinzu
	 * 
	 * @param x
	 */
	public void insertLast(Object x) {
		if (isEmpty()) {
			/*
			 * wenn kein Objekt vorhanden ist, ist das letzte auch das erste.
			 * Also mach ein erstes. ACHTUNG: die Länge wird im insertFirst(x)
			 * gesetzt.
			 */
			insertFirst(x);
		} else if (head == tail) {
			/*
			 * wenn erst ein Objekt in der Liste ist, muss ein neuer tail
			 * erzeugt werden
			 */
			tail = new Node(x);
			head.next = tail;
			length++;
		} else {
			/*
			 * wenn bereits mehr als ein Objekt in der liste vorhanden ist,
			 * erzeuge ein neues objekt tail und setze beim altenTail.next auf
			 * den neuen Tail
			 */
			Node alterTail = tail;
			tail = new Node(x);
			alterTail.next = tail;
			length++;
		}
	}

	/**
	 * Fügt ein Objekt (x) an letzter Stelle hinzu
	 * 
	 * @param x
	 */
	public void removeLast() {
		if (isEmpty() || head == tail) {
			/*
			 * wenn die Liste leer ist, oder nur ein Element enthält, wird das
			 * Objekt nicht gelöscht. Das ist eine Annahme. Ist in der
			 * Aufgabenstellung so nicht gefordert.
			 */
			System.out.println("Objekt konnte nicht entfernt werden.");
		} else {
			/*
			 * Hier wird wieder gleichzeitig das letzte und das zweit letzte
			 * Objekt ermittelt.
			 */
			Node zweitLetzter = head;
			Node hilf = head;
			while (hilf.next != null) {
				zweitLetzter = hilf;
				hilf = hilf.next;
			}
			/*
			 * Das zweitletzte wird also wieder auf tail gesetzt und die
			 * Referenz auf das nächste Objekt muss noch geleert werden.
			 * Zusätzlich wird die Länge um eines verkürtzt
			 */
			tail = zweitLetzter;
			tail.next = null;
			length--;
		}
	}

	/*
	 * Object-Methods
	 */
	/**
	 * Fügt ein Object (x) an der Stelle (index) hinzu
	 * 
	 * @param x
	 * @param index
	 */
	public void insertObject(Object x, int index) {
		if (isIndexInRange(index)) {
			/*
			 * Damit nur einmal ein Loop über die Liste gemacht werden muss,
			 * werden die Variablen prevNode und hilf im selben Loop abgefüllt
			 */
			Node prevNode;
			Node newNode;
			Node hilf = head;
			prevNode = head;
			for (int i = 0; i < index; i++) {
				prevNode = hilf;
				hilf = hilf.next;
			}
			newNode = new Node(x);
			newNode.next = hilf;
			prevNode.next = newNode;
			length++;
		} else {
			System.out
					.println("Improvisiertes exception handling: Index ist grösse als die Liste");
		}
	}

	/**
	 * Setzt das übergebene Objekt an der Vorgegebenen Stelle
	 * 
	 * @param x
	 * @param index
	 * 
	 */
	public void setObject(Object x, int index) {
		if (isIndexInRange(index)) {
			Node hilf = head;
			for (int i = 0; i < index; i++) {
				hilf = hilf.next;
			}
			hilf.info = x;
		} else {
			System.out
					.println("Improvisiertes exception handling: Index ist grösse als die Liste");
		}
	}

	/**
	 * Setzt das übergebene Objekt an der Vorgegebenen Stelle
	 * 
	 * @param x
	 * @param index
	 * 
	 */
	public Node getObject(int index) {
		Node hilf = null;
		if (isIndexInRange(index)) {
			hilf = head;
			for (int i = 1; i < index; i++) {
				hilf = hilf.next;
			}
		} else {
			System.out
					.println("Improvisiertes exception handling: Index ist grösse als die Liste, deshalb gib tail zurück");
			hilf = tail;
		}
		return hilf;
	}

	/*
	 * Show-Methods
	 */
	/**
	 * Gib den ersten Datensatz aus
	 */
	public void showFirst() {
		System.out.println("First:");
		System.out.println("  " + head.info);
		System.out.println("  " + head.next);
	}

	/**
	 * Gib den letzten Datensatz aus
	 */
	public void showLast() {
		System.out.println("Last:");
		System.out.println("  " + tail.info);
		System.out.println("  " + tail.next);
	}

	/**
	 * Gib die ganze Liste aus
	 */
	public void showList() {
		System.out.println("Complete List:");
		/*
		 * Damit begonnen werden kann, muss eine Schleife über alle Objekte
		 * loopen, ohne dass diese Schleife etwas verändert. Deshalb wird das
		 * Head Objekt in das Hilf Objekt geschrieben
		 */
		Node hilf = head;
		while (hilf != null) {
			System.out.println("  " + hilf.info);
			System.out.println("  " + hilf.next);
			// Gehe auf den nächsten Datensatz
			hilf = hilf.next;
		}
		System.out.println("Länge (wir beginnen bei 0 zu zählen)");
		System.out.println("  " + length);
	}

	/*
	 * Reverse - Handling
	 */
	/**
	 * Kehrt die Liste um (wenn die Liste nicht leer ist)
	 */
	public void reverseList() {
		if (!isEmpty()) {
			/*
			 * der neue Head ist der Tail. Bei verschiedenen Methoden, wird aber
			 * der Head benötigt. Deshalb wird der neue Head erst am Schluss
			 * gesetzt.
			 */
			Node newHead = tail;
			for (int i = length; i >= 0; i--) {
				if (i > 0) {
					/*
					 * solange die Liste noch nicht am Ende ist, wird in next
					 * das Objekt geschrieben
					 */
					getObject(i).next = getObject(i - 1);
				} else {
					/*
					 * das letzte Objekt ist erreicht. Somit ist dies der Tail
					 * und dessen next ist null
					 */
					getObject(i).next = null;
				}
			}
			/* der neue Head und Tail wird gesetzt. */
			tail = head;
			head = newHead;
		}
	}

}
