package k11s338;

public class GenPaarTestWild3 {
	public static void genPaarAusgeben3(GenPaar<? super Hose> gp){
		System.out.println(gp);
	}
	public static void main(String [] args) {
		Jeans j1 = new Jeans();
		Jeans j2 = new Jeans();
		Hose h1 = new Hose();
		Hose h2 = new Hose();

		GenPaar<Jeans> p1 = new GenPaar<Jeans> (j1,j2);
		genPaarAusgeben3(p1);

		GenPaar<Hose> p2 = new GenPaar<> (h1,h2);
		genPaarAusgeben3(p2);


	}
}
