package ch.softwareexperts.java.collection.comparator;
import java.util.*;

public class Tools {

	static Random r = new Random();

  public static int genRandomNumber(int to){
	// Generate a random number in: 0.. to-1
		return Math.abs(r.nextInt()) % to;
	}
}
