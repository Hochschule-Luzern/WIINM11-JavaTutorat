package k11s334;

public class HemdAlt extends Kleidung {
	
	private HemdAlt l, r;

	public HemdAlt (HemdAlt l, HemdAlt r) {
		this.l = l;
		this.r = r;
	}
	public HemdAlt getL() {
		return l;
	}
	public HemdAlt getR() {
		return r;
	}
	public String toString() {
		return "Hemd";
	}

}
