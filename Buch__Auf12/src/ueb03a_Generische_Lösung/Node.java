package ueb03a_Generische_Lösung;


//noch prüfen, ob da alles stimmt!
public class Node<T> {
	
	T info;
	Node<T> next;
	
	public Node(T x) {
		info = x;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}