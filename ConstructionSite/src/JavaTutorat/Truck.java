package JavaTutorat;

public class Truck {
	
	/* Properties */
	
	private String name;
	private int weight;
	
	public Truck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	/* Getter und Setter */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
