package auf_11_7;

/*
 * "Grundkurs Programmieren in Java (6. Auflage, 2011)"
 * 2003-2011, Carl Hanser Verlag
 * Loesungsvorschlag zu Aufgabe 13.1 (Version 2.0)
 * (c) 2003-2011 D. Ratz, J. Scheffler, D. Seese, J. Wiesenberger
 *
 */

class Person {
}
class Performer extends Person {
}
class Star extends Performer {
}
class Zuschauer extends Person {
}
class Groupie extends Zuschauer {
}
class HuebschesGroupie extends Groupie {
}
class Roadie<T extends Person> {
	public void gewaehreEinlass(T person) {
		System.out.println("Willkommen, " + person);
	}
}

public class Konzert {
	private Roadie<? extends Zuschauer> vorderEingang;
	private Roadie<? super Star> hinterEingang;
	private Roadie<? extends Groupie> backstage;

	public Konzert(Roadie<? extends Zuschauer> vorderEingang,
			Roadie<? super Star> hinterEingang,
			Roadie<? extends Groupie> backstage) {
		this.vorderEingang = vorderEingang;
		this.hinterEingang = hinterEingang;
		this.backstage = backstage;
	}
	public static void main(String[] args) {
		final Roadie<Zuschauer> roadie1 = new Roadie<Zuschauer>();
		final Roadie<Performer> roadie2 = new Roadie<Performer>();
		final Roadie<HuebschesGroupie> roadie3 = new Roadie<HuebschesGroupie>();
		final Roadie<Groupie> roadie4 = new Roadie<Groupie>();
		final Roadie<Star> roadie5 = new Roadie<Star>();
		final Roadie<Person> roadie6 = new Roadie<Person>();
		final Roadie roadie7 = new Roadie();
		Konzert konzert1 = new Konzert(roadie1,roadie2,roadie3);
		Konzert konzert2 = new Konzert(roadie2,roadie2,roadie3);
		Konzert konzert3 = new Konzert(roadie1,roadie5,roadie4);
		Konzert konzert4 = new Konzert(roadie1,roadie5,roadie4);
		Konzert konzert5 = new Konzert(roadie4,roadie5,roadie4);
		Konzert konzert6 = new Konzert(roadie6,roadie2,roadie3);
		Konzert besondersExklusiv = new Konzert(roadie3,roadie5,roadie3);
		Konzert besondersLax = new Konzert(roadie7,roadie7,roadie7);
	}
}
