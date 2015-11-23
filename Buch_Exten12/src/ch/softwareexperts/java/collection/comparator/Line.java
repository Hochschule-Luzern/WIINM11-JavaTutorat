package ch.softwareexperts.java.collection.comparator;


public class Line {
	private int sp_x1;
	private int x2;
	private double l;

	Line(int sp_x1, int x2) {
		this.sp_x1 = sp_x1;
		this.x2 = x2;
		l = Math.abs(x2 - sp_x1);
	}

	public double length() {
		return l;
	}
	public String toString() {
		return "Length: " + l;
	}
}

