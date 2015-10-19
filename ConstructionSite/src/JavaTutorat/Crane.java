package JavaTutorat;

public class Crane {
	
	/* Properties */
	
	private String name;
	private String manufacturer;
	
	private int length;
	private int height;
	private int maxWeight;
	
	private int range;
	private int rotation;
	
	private Truck truck = null;
	
	/* Constructors */
	
	// Standard constructor
	public Crane(){
		
	}
	
	// custom constructor
	public Crane(String name, String manufacturer, int length, int height, int maxWeight) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.length = length;
		this.height = height;
		this.maxWeight = maxWeight;
	}
	
	/* Getter and Setters */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if(length < 50){
			try{
				throw new Exception("Max length is 40!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height < 50){
			try{
				throw new Exception("Max height is 50!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.height = height;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		if(maxWeight < 50000){
			try {
				throw new Exception("Max weight is 50'000kg!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.maxWeight = maxWeight;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		if(range < (length-10)){
			try {
				throw new Exception("Max range is" + (length-10));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.range = range;
	}

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
	
	/* Methods */
	
	public void liftUp(int range){
		System.out.println("Truck was lifted up for " + range + " m.");
		
	}

	public void liftDown(int range){
		System.out.println("Truck was lifted down for " + range + " m.");
	}
	
	public void moveForward(int range){
		System.out.println("Crane chop was moved forward for " + range + " m");
	}
	
	public void moveBackward(int range){
		System.out.println("Crane chop was moved backward for " + range + " m");
	}
	
	public void turnLeft(int degrees){
		System.out.println("Crane was turned left for " + degrees + " degree ");
	}
	
	public void turnRight(int degrees){
		System.out.println("Crane was turned left for " + degrees + " degree ");	}
	
	public void attach(Truck truck){
		if(truck.getWeight() > maxWeight){
			try {
				throw new Exception("Truck is too heavy!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.truck = truck;	
	}

	public void release(){
		
	}
}
