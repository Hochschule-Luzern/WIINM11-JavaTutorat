package auf_11_4;

public class TierKaefigMain {

	public static void main(String[] args) {
		// Variante 1:
//		TierKaefig<Tier> kaefig = new TierKaefig<Katze>();
		
		// Varante 2:
		
//		TierKaefig<Hund> kaefig = new TierKaefig<Tier>();
		
		// Varante 3:
//		TierKaefig<?> kaefig = new TierKaefig<Katze>();
//		kaefig.setInsasse(new Katze());
		
		
		// Varante 4:
		TierKaefig kaefig = new TierKaefig();
		kaefig.setInsasse(new Hund());
	}
}
