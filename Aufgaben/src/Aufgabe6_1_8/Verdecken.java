package Aufgabe6_1_8;

public class Verdecken {
	static int a = 1, b = 2, c = 3;

	static int m(int a) {
		// a=3
		int b = 20;
		System.out.println("a = " + a); //3
		System.out.println("b = " + b); //4
		System.out.println("c = " + c); //5
		return 100;
	}

	public static void main(String[] args) {
		int a = 1000;
		System.out.println("a = " + a); //1
		System.out.println("b = " + b); //2
		// c=3
		System.out.println("m(c)= " + m(c)); //6
	}
}
