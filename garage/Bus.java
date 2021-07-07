package qa.garage;

public class Bus extends Vehicle {

	private String model;
	private int capacity;

	public Bus(int engineccSize, String manufacturerName, int numberOfWheels, String model, int capacity) {
		super(engineccSize, manufacturerName, numberOfWheels);
		this.model = model;
		this.capacity = capacity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int calculate()

	{
		return (getEngineccSize() * getNumberOfWheels());
	}

}
