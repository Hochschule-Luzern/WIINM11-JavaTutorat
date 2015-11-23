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
	 * Diese Methode brauchen Sie eventuell (!!) f�r die Methoden
	 * insertObject(....), getObject(...), setObject(....)
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
	
	/**
	 * F�gt ein Objekt (x) an erster Stelle hinzu
	 * 
	 * @param x
	 */
	public void insertFirst(Object x) {
		if (isEmpty()) {
			// wenn noch kein Objekt vorhanden ist, dann mach eines.
			// Zus�tzlich zeigen head und tail auf das gleiche Node-Objekte
			head = new Node(x);
			tail = head;
			tail.setNext(null);     // tail.next = null  geht nicht wegen visibility!
			length++;
		} else {
			// wenn bereits mindestens ein Objekt in der Liste ist, wird eines
			// am Anfang hinzugef�gt.
			// der neue head ist nun das neue Node
			Node newNode = new Node(x);
			newNode.setNext(head);    // newNode.next = head geht nicht wegen visibility!
			head = newNode;
			length++;
		}
	}	
	
	
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
			 * wenn erst ein Objekt in der Liste ist, muss ein neuer tail
			 * erzeugt werden
			 */
			Node newNode = new Node(x);
			tail = newNode;
			head.setNext(newNode);
			length++;
			
		} else {
			/*
			 * wenn bereits mehr als ein Objekt in der liste vorhanden ist,
			 * erzeuge ein neues objekt tail und setze beim altenTail.next auf
			 * den neuen Tail
			 */
			Node newNode = new Node(x);
			tail.setNext(newNode);
			tail = newNode;
			length++;
		}
	}

	
	/**
	 * L�scht ein Objekt (x) an erster Stelle 
	 * 
	 */
	public Object removeFirst() {
		
		Node delete = head;
		head = head.getNext();
		length--;
		return delete.info;
	}

	/**
	 * L�scht ein Objekt (x) an letzter Stelle 
	 * 
	 * @param x
	 */
	public void removeLast() {
		Node zweitletzer = getObject(length-1);
		zweitletzer.setNext(null);
		tail = zweitletzer;
		length--;
	}

	
	/**
	 * F�gt ein Object (x) an der Stelle (index) hinzu
	 * 
	 * @param x
	 * @param index
	 */
	public void insertObject(Object x, int index) {
		if (isIndexInRange(index)) {
			/*
			 * Damit nur einmal ein Loop �ber die Liste gemacht werden muss,
			 * werden die Variablen prevNode und hilf im selben Loop abgef�llt
			 */
			Node prevNode;
			Node newNode = new Node(x);
			Node hilf = head;
			prevNode = head;
			for (int i = 0; i < index; i++) {
				// Node vor newNode
				prevNode = hilf;
				
				// Node nach newNode
				hilf = hilf.getNext();
			}
			newNode.setNext(hilf);
			prevNode.setNext(newNode);
			length++;
		} else {
			System.out.println("Index gr�sser als L�nge Liste!");
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
				hilf = hilf.getNext();
			}
			hilf.setInfo(x);
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
	public Node getObject(int index) {
		Node hilf = null;
		if (isIndexInRange(index)) {
			hilf = head;
			for (int i = 1; i < index; i++) {
				hilf = hilf.getNext();
			}
		} else {
			System.out
					.println("Improvisiertes exception handling: Index ist gr�sse als die Liste, deshalb gib tail zur�ck");
			hilf = tail;
		}
		return hilf;
	}

	
	
	
	
	/**
	 * Gib den ersten Datensatz aus
	 */
	public void showFirst() {
		System.out.println("First:");
		System.out.println("  " + head.getInfo());
		System.out.println("  " + head.getNext());
	}

	/**
	 * Gib den letzten Datensatz aus
	 */
	public void showLast() {
		System.out.println("Last:");
		System.out.println("  " + tail.getInfo());
		System.out.println("  " + tail.getNext());
	}

	/**
	 * Gib die ganze Liste aus
	 */
	public void showList() {
		System.out.println("Complete List: ");
		/*
		 * Damit begonnen werden kann, muss eine Schleife �ber alle Objekte
		 * loopen, ohne dass diese Schleife etwas ver�ndert. Deshalb wird das
		 * Head Objekt in das Hilf Objekt geschrieben
		 */
		if (head == null){
			System.out.println("Die Liste ist leer!!!");
		}
		else{
		Node hilf = head;
		while (hilf != null) {
			System.out.print("Info-Value: " + hilf.getInfo() + "; ");
			if(!(hilf.getNext() == null))
			{System.out.println("Next-Referce: " + hilf.getNext().info);
			}else{
				System.out.println("Next-Referce: " + "Null");
			}
			// Gehe auf den n�chsten Datensatz
			hilf = hilf.getNext();
		}
		System.out.print("L�nge (wir beginnen bei 0 zu z�hlen): ");
		System.out.println("  " + length);
		}
	}


	/**
	 * Kehrt die Liste um (wenn die Liste nicht leer ist)
	 */
	public void reverseList() {
		if(!isEmpty()){
			
			for(int i = length; i >=0; i--){
				if(i > 0){
					getObject(i).setNext(getObject(i-1));
				}else{
					getObject(i).next = null;
				}
			}
			
			Node newHead = tail;
			tail = head;
			head = newHead;
			
			
			
		}
	}

}
