package Block3_Aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public static void main(String[] args){
		int zahl1 = 17;
		int zahl2 = 24;
		
		if(isPrim(zahl1)){
			
			System.out.println("Zahl: " + zahl1 + " ist eine Primzahl.");
		}else{
			
			System.out.println("Keine Primzahl");
			System.out.println("Primfaktoren: ");
			List<Integer> list = primeFactors(zahl1);
			for(Integer i : list){
				System.out.println(i);
			}
		}
		
		if(isPrim(zahl2)){
			
			System.out.println("Zahl: " + zahl2 + " ist eine Primzahl.");
		}else{
			System.out.println("Keine Primzahl");
			System.out.println("Primfaktoren: ");
			List<Integer> list = primeFactors(zahl2);
			for(Integer i : list){
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrim(int zahl){
		
		for(int i=2; i<zahl; i++){
           if(zahl%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
	}
	
	public static List<Integer> primeFactors(int zahl) {
	    List<Integer> factors = new ArrayList<Integer>();
	    for (int i = 2; i <= zahl; i++) {
	      while (zahl % i == 0) {
	        factors.add(i);
	        zahl /= i;
	      }
	    }
	    return factors;
	  }
	
}
