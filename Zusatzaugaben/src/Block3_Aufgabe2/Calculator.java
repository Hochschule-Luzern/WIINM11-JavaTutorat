package Block3_Aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public static void main(String[] args){
		String option = args[0];
		int zahl = Integer.parseInt(args[1]);
		
		switch(option){
		
			case "-p" : {
				if(isPrim(zahl)){
					System.out.println("Zahl: " + zahl + " ist eine Primzahl.");
				}else{
					
					System.out.println("Keine Primzahl");
				}
			}
			
			case "-f" : {
				List<Integer> list = primeFactors(zahl);
				for(Integer i : list){
					System.out.println(i);
				}
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
