package Block9_Beispiele;

public class Employee extends Person implements Speek{

	// Klassenspezifische Instanzvariablen
	private String employeeId;
	
	// Konstruktor
	public Employee(String ln, String fn, int birthyear, String EmpId, int a) {
		// Zugriff auf name und fistname nicht möglich, bzw. nur über Konstruktuor und öffentliche Methoden möglich.
		super(ln, fn); // Java ruft hier den Konstruktor der Oberklasse auf
		
		// Zugriff auf geschützte Instanzvariable
		this.birthyear = birthyear;
		
		// Zugriff auf eigene Instanzvariable
		employeeId = EmpId;
		
		// Zugriff auf öffentliche Instanzvariable
		age = a;
	}

	// zustätzliche Getter Setter
	public String getEmployeeId() {
		return employeeId;
	}
	
	// zusätzliche Methode
	public String printAll() {
		return (fullName() + " " + employeeId + " " + age);
	}

	// Methode von Interface
	@Override
	public String tellName() {
		return ("Hello, my name is " + this.fullName());
	}
}
