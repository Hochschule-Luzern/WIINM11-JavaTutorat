package ueb02a_Partielle_L�sung;

public class LinkedList {

	private Node head, tail;
	private int length = 0;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public LinkedList(Node h, Node t) {
		head = h;
		tail = t;
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
	 * d.h. ist index < length
	 * Beispiel: length = 3 => index = 2 (maximal)
	 * @return boolean
	 * 
	 * */
	private boolean isIndexInRange(int index) {
		if ((index < length) && !isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * First - Handling
	 */
	/**
	 * F�gt ein Objekt (x) an erster Stelle hinzu
	 * 
	 * @param x
	 */
	public void insertFirst(Object x) {
		if (isEmpty()) {
			// wenn noch kein Objekt vorhanden ist, dann mach eines.
			// Zus�tzlich sind head und tail die selben Objekte
			head = new Node(x);
			tail = head;
			tail.next = null;
			length++;
		} else {
			// wenn bereits mindestens ein Objekt in der Liste ist, wird eines
			// am Anfang hinzugef�gt.
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
	 * F�gt ein Objekt (x) an letzter Stelle hinzu
	 * 
	 * @param x
	 */
	public void insertLast(Object x) {
		if (isEmpty()) {
			/*
			 * wenn kein Objekt vorhanden ist, ist das letzte auch das erste.
			 * Also mach ein erstes. ACHTUNG: die L�nge wird im insertFirst(x)
			 * gesetzt.
			 */
			insertFirst(x);
		} else if (head == tail) {
			/*
			 * wenn genau ein Objekt in der Liste ist, muss ein neuer tail
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
	 * F�gt ein Objekt (x) an letzter Stelle hinzu
	 * 
	 * @param x
	 */
	public Object removeLast() {
		if (isEmpty()){
			return null;
		} else if(length == 1){
			length--;
			return removeFirst();
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
			 * Referenz auf das n�chste Objekt muss noch geleert werden.
			 * Zus�tzlich wird die L�nge um eines verk�rtzt
			 */
			Node last = tail;
			tail = zweitLetzter;
			tail.next = null;
			length--;
			return last;
		}
	}

	/*
	 * Object-Methods
	 */
	/**
	 * F�gt ein Object (x) an der Stelle (index) hinzu
	 * 
	 * @param x
	 * @param index  geht von 0 bis legth-1 !!
	 */
	public void insertObject(Object x, int index) {
		if (isIndexInRange(index)) {
			/*
			 * Damit nur einmal ein Loop �ber die Liste gemacht werden muss,
			 * werden die Variablen prevNode und hilf im selben Loop abgef�llt
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
					.println("Improvisiertes exception handling: Index ist gr�sse als die Liste");
		}
	}

	/**
	 * Setzt das �bergebene Objekt an der Vorgegebenen Stelle
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
					.println("Improvisiertes exception handling: Index ist gr�sse als die Liste");
		}
	}

	/**
	 * gibt das Objekt an der Stelle index zur�ck!
	 * 
	 * @param x
	 * @param index  index l�uft von 0 bis length-1
	 * 
	 */
	public Node getObject(int index) {
		Node hilf = null;
		if (isIndexInRange(index)) {
			hilf = head;
			for (int i = 0; i < index; i++) {
				hilf = hilf.next;
			}
		} else {
			System.out
			.println("Improvisiertes exception handling: Index ist gr�sse als die Liste, deshalb gib tail zur�ck");
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
		 * Damit begonnen werden kann, muss eine Schleife �ber alle Objekte
		 * loopen, ohne dass diese Schleife etwas ver�ndert. Deshalb wird das
		 * Head Objekt in das Hilf Objekt geschrieben
		 */
		Node hilf = head;
		while (hilf != null) {
			System.out.print("  " + hilf.info);
			System.out.println("  " + hilf.next);
			// Gehe auf den n�chsten Datensatz
			hilf = hilf.next;
		}
	}

	/**
	 * Gib die L�nge der Liste aus
	 */
	 public void showListLength(){
			System.out.println("L�nge (wir beginnen bei 0 zu z�hlen): " + length);
	 }
	
	
	
	
	/*
	 * Reverse - Handling
	 */
	/**
	 * Kehrt die Liste um (wenn die Liste nicht leer ist)
	 */
	public LinkedList reverseList() {
		if (!isEmpty()) {
			/*
			 * der neue Head ist der Tail. Bei verschiedenen Methoden, wird aber
			 * der Head ben�tigt. Deshalb wird der neue Head erst am Schluss
			 * gesetzt.
			 */
			Node newHead = tail;
			for (int i = length-1; i >= 1; i--) {
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
			tail.next= null;   // Nur diese Zeile hat gefehlt!!!!!
			head = newHead;
			return new LinkedList(head,tail);
		}else {
			return null;
		}
	}

	public Object removeFirst() {
		if (isEmpty()) {
			return null;
		} else {
			// wenn bereits mindestens ein Objekt in der Liste ist, 
			// wird eine Hilfsnode-Referenz erzeugt, welche nach dem 
			// "umbiegen" des Startnodes (head) noch immer auf das 
			// zu l�schende Node-Objekt zeigt. Dieses wird zur�ckgegeben!
			Node first = head;
			head = head.next;
			length--;
			return first;
		}
	}

}
