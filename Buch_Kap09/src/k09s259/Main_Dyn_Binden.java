package k09s259;

public class Main_Dyn_Binden {

		public static void main(String[] args) {
			
		
		// Erzeuge eine Instanz der Klasse Sohn
		Sohn s=new Sohn();
		// 1. Zeige zuerst den Inhalt von s
		System.out.println("#### 1. Zeige zuerst den Inhalt von s #### ");
		System.out.print("s.zeigeVar() => "); s.zeigeVar();
		
		System.out.print("s.zeigeSohn()) => ");s.zeigeSohn();
		System.out.print("s.zeigeVater() => ");s.zeigeVater();
		System.out.println("\n");
		
		// 2. nun dasselbe, jedoch nach einer Typumwandlung
		System.out.println("#### 2. nun dasselbe, jedoch nach einer Typumwandlung #### ");
		Vater t = new Vater();
		System.out.println("s: " + s.toString());
		System.out.println("t: " + t.toString());		
		System.out.println("Vater t = (Vater)s   => "); t = (Vater)s;
		System.out.println("... und jetzt t: " + t.toString() + ".... WAU!");	
		System.out.print("t.zeigeVar() => "); t.zeigeVar();
		System.out.print("t.zeigeVater() => "); t.zeigeVater();
		System.out.print("((Vater)s).zeigeVar() => ");((Vater)s).zeigeVar();
		System.out.print("((Vater)s).zeigeVater() => ");((Vater)s).zeigeVater();
		System.out.println("\n");
		
		// 3. jetzt gib die Instanzvariable von Hand aus
		System.out.println("#### 3. jetzt gib die Instanzvariable von Hand aus #### ");
		System.out.print("\"SOHN: +s.var \" => "); System.out.println("SOHN: "+s.var);
		System.out.println("\n");		
		
		// 4. und tue dasselbe erneut nach einer Typumwandlung
		System.out.println("#### 4. und tue dasselbe erneut nach einer Typumwandlung #### ");		
		System.out.print("\"VATER: + ((Vater)s).var \" => "); 
		System.out.println("VATER: "+((Vater) s).var);
		System.out.println("");
		
		System.out.println("STAUN!!! Für Variablen kommt keine dynamische Binding ins Spiel => \n"
				+ "Compiler entscheidet schon zur Übersetzungszeit, welche Variable ausgegeben wird!");
		
		}
	
}
