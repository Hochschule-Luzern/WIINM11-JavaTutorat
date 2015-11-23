package ch.hslu.wi.krüger.kap16_8_1_b;

import java.util.ArrayList;
import java.util.Collections;

public class Kap16_8_1_b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printSorted2(5,34,1,23,67,4);

	}

	public static void printSorted2(int... args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < args.length; ++i) {
			l.add(new Integer(args[i]));
		}
		Collections.sort(l);
		for (int i = 0; i < l.size(); ++i) {
			int wert = 10 * l.get(i).intValue();
			System.out.print(wert + " ");
		}
		System.out.println();
	}
}
