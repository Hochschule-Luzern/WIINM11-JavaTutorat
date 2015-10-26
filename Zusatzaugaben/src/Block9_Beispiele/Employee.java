package Block9_Beispiele;

public class Employee extends Person implements Speek{

	// Klassenspezifische Instanzvariablen
	private String employeeId;
	
	// Konstruktor
	public Employee(String ln, String fn, int birthyear, String EmpId, int a) {
		// Zugriff auf name und fistname nicht m�glich, bzw. nur �ber Konstruktuor und �ffentliche Methoden m�glich.
		super(ln, fn); // Java ruft hier den Konstruktor der Oberklasse auf
		
		// Zugriff auf gesch�tzte Instanzvariable
		this.birthyear = birthyear;
		
		// Zugriff auf eigene Instanzvariable
		employeeId = EmpId;
		
		// Zugriff auf �ffentliche Instanzvariable
		age = a;
	}

	// zust�tzliche Getter Setter
	public String getEmployeeId() {
		return employeeId;
	}
	
	// zus�tzliche Methode
	public String printAll() {
		return (fullName() + " " + employeeId + " " + age);
	}

	// Methode von Interface
	@Override
	public String tellName() {
		return ("Hello, my name is " + this.fullName());
	}
}
