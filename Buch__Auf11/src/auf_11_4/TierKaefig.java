package auf_11_4;

class TierKaefig<E> {
	private E insasse;
	public void setInsasse(E x) {
		insasse = x;
	}
	public E getInsasse() {
		return insasse;
	}
}
class Tier {
}
class Katze extends Tier {
}
class Hund extends Tier {
}

