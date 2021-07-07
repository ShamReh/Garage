package qa.garage;

public class Motorbike extends Vehicle {

	private String fuelType;

	public Motorbike(int engineccSize, String manufacturerName, int numberOfWheels, String fuelType) {
		super(engineccSize, manufacturerName, numberOfWheels);
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public int calculate()

	{
		return ((getEngineccSize() + getNumberOfWheels()) * 2);
	}

}
