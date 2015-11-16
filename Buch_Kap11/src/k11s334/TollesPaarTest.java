package k11s334;

public class TollesPaarTest {
	public static void main(String[] args) {
		Hemd he1 = new Hemd();
		Hemd he2 = new Hemd();
		Hose ho1 = new Hose();
		Hose ho2 = new Hose();
		Ohrring o1 = new Ohrring();
		Ohrring o2 = new Ohrring();
		TollesPaar<Hemd> p1 = new TollesPaar<Hemd>(he1,he2);
		TollesPaar<Hose> p2 = new TollesPaar<Hose>(ho1,ho2);
		/*
	    TollesPaar<Ohrring> p3 = 
	            new TollesPaar<Ohrring>(o1,o2); // unzulaessig
		 */

		Kleidung kl1 = new Kleidung();
		Kleidung kl2 = new Kleidung();	    
		TollesPaar<Kleidung> p4 = new TollesPaar<Kleidung>(kl1,kl2);
		System.out.println(p1);
		System.out.println(p2);	    
		//System.out.println(p4);	    
	}
}
