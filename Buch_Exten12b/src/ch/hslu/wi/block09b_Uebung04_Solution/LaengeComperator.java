package ch.hslu.wi.block09b_Uebung04_Solution;

import java.util.Comparator;

public class LaengeComperator implements Comparator<Groesse> {

	@Override
	public int compare(Groesse s0, Groesse s1) {
		
		int laenge0 = s0.laenge();		
		//aktuelles Objekt
		int laenge1 = s1.laenge();
        
	    if( laenge0 < laenge1 ){
	        return -1;
	    }    
	    if( laenge0 > laenge1 ){
	        return  1;            
		}
	    return 0;  
	}

}
