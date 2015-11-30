package uebung03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class uebung03_main {
	public static void main(String[] args) {
		PapierBlatt pb1 = new PapierBlatt("A0");
		PapierBlatt pb2 = new PapierBlatt("A1");
		PapierBlatt pb3 = new PapierBlatt("A2");
		PapierBlatt pb4 = new PapierBlatt("A3");
		PapierBlatt pb5 = new PapierBlatt("A4");
		PapierBlatt pb6 = new PapierBlatt("A5");
		PapierBlatt pb7 = new PapierBlatt("A6");
		PapierBlatt pb8 = new PapierBlatt("A7");
		
		List<PapierBlatt> blaetter = new LinkedList<PapierBlatt>();
		blaetter.add(pb1);
		blaetter.add(pb4);
		blaetter.add(pb6);
		blaetter.add(pb2);
		blaetter.add(pb7);
		blaetter.add(pb3);
		blaetter.add(pb8);
		blaetter.add(pb5);
		
		Collections.sort(blaetter);
		
		for (PapierBlatt pb : blaetter) {
			System.out.println(pb.getFormat());
		}
		
		
	}
}
