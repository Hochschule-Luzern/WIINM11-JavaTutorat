package k11s334;

public class HoseAlt {
	
	private HoseAlt l, r;

	public HoseAlt (HoseAlt l, HoseAlt r) {
		this.l = l;
		this.r = r;
	}
	public HoseAlt getL() {
		return l;
	}
	public HoseAlt getR() {
		return r;
	}
	public String toString() {
		return "HoseAlt";
	}
}
