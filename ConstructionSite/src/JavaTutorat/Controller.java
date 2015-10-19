package JavaTutorat;

public class Controller {

	public static void main(String[] args) {

		/* This is where every application starts it's lifecycle */
		
		
		// Let's build a crane
		
		// Standard constructor
		Crane crane1 = new Crane();
		crane1.setName("Hubalot 1");
		crane1.setManufacturer("Cat");
		crane1.setLength(35);
		crane1.setHeight(45);
		crane1.setMaxWeight(40000);
		
		// userdefined constructor
		Crane crane2 = new Crane("Hubalot 2", "Cat", 35, 45, 40000);
		
		// Build the trucks
		Truck truck1 = new Truck("lkw1", 3000);
		//Truck truck2 = new Truck();
		Truck truck3 = new Truck("lkw3", 5500);
		
		crane1.setRange(10);
		crane1.attach(truck1);
		crane1.liftUp(10);
		crane1.liftDown(10);
		crane1.release();
	}

}
