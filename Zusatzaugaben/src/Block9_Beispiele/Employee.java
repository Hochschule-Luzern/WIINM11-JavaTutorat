package Block9_Beispiele;

public class Employee extends Person implements Speek{

	// Klassenspezifische Instanzvariablen
	private String employeeId;
	
	// Konstruktor
	public Employee(String ln, String fn, String EmpId, int a) {
		super(ln, fn); // Java ruft hier den Konstruktor der Oberklasse auf
		employeeId = EmpId;
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
