package Block9_Beispiele;

public class App {

	public static void main(String[] args) {
		
		// Deklaration Personen
		Employee e1 = new Employee("Doe","Jane", 1993, "1", 25);
        Customer c1 = new Customer();
        c1.setName("Trump", "Donald");
        
        // Zugriff öffentliche Variablen
        e1.age++;
        
        // Ausgabe mit Klassenmethode
        System.out.println(e1.printAll());
        System.out.println(c1.printAll());
        
        // Asugabe mit Superklassenmethode
        System.out.println(e1.fullName());
        System.out.println(c1.fullName());
        
        // Ausgabe mit Interfacemethode
        System.out.println(e1.tellName());
        System.out.println(c1.tellName());
        
        System.out.println("\nNeue Deklaration" );
        
        // Polymorphismus mit Superklasse
       Person p1 = e1;
       Person p2 = c1;
       
       // Ausgabe mit Klassenmethode
       // Funktioniert nicht, weil die Person Klasse, diese Methoden nicht kennt.
       
       // Ausgabe mit Klassenmethode
       System.out.println(p1.fullName());
       System.out.println(p2.fullName());
        
       // Ausgabe mit Interfacemethode
       // Funktioniert nicht, weil die Person Klasse das Interface Speek nicht implementiert.
       
       System.out.println("\nNeue Deklaration" );
       
        // Polymorphismus mit Interface
       Speek s1 = (Speek) p1;
       Speek s2 = (Speek) p2;
       
       // Ausgabe mit Klassenmethode
       // Funktioniert nicht, weil das Interface diese Methoden nicht deklariert.
       
       // Asugabe mit Superklassenmethode
       // Funktioniert nicht, weil das Interface diese Methoden nicht deklariert und die Person Klasse das Interface Speek nicht impementiert.
       
       // Ausgabe mit Interfacemethode
       System.out.println(s1.tellName());
       System.out.println(s2.tellName());
       
       System.out.println("\nNeue Deklaration" );
       
       // Polymorphismus mit Abstrakter Klasse
       AbstractCustomer a2 = (AbstractCustomer) p2;
       
       // Ausgabe mit abstrakter Methode
       System.out.println(a2.getCustomerName());
	}

}
