package k11s336;

import k11s334.Hose;
import k11s334.Kleidung;
import k11s334.TollesPaar;

public class TollesPaarTestWild1 {

	public static void paarAusgeben1(TollesPaar<Kleidung> tp){
		System.out.println(tp);
	}

	public static void main(String [] args) {
		Hose ho1 = new Hose();
		Hose ho2 = new Hose();

		TollesPaar<Hose> p1 = new TollesPaar<Hose> (ho1,ho2);
		paarAusgeben1(p1);
	}
}

