package qa.garage;

public abstract class Vehicle {

	private int engineccSize;
	private String manufacturerName;
	private int numberOfWheels;

	public Vehicle(int engineccSize, String manufacturerName, int numberOfWheels) {
		super();
		this.engineccSize = engineccSize;
		this.manufacturerName = manufacturerName;
		this.numberOfWheels = numberOfWheels;

	}

	public Vehicle() {

	}

	public int getEngineccSize() {
		return engineccSize;
	}

	public void setEngineccSize(int engineccSize) {
		this.engineccSize = engineccSize;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public abstract int calculate();

	{

	}

}
