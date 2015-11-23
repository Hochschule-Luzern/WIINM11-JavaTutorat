package ch.hslu.wi.krüger.kap16_8_1_c;

import java.util.ArrayList;
import java.util.Collections;

public class Kap16_8_1_c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printSorted3(5,34,1,23,67,4);

	}

	public static void printSorted3(int... args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i : args) {
		//for (Integer i : args) {	   // bitte mit Debugger verfolgen!
									   // Autoboxing in Aktion!
			l.add(i); 
		}
		Collections.sort(l);
		for (Integer i : l) {
			System.out.print((i * 10) + " "); 
		}
		System.out.println();
	}
}
