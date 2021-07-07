package qa.garage;

public class Car extends Vehicle {

	private String type;

	public Car(int engineccSize, String manufacturerName, int numberOfWheels, String type) {
		super(engineccSize, manufacturerName, numberOfWheels);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int calculate()

	{
		return (getEngineccSize() + getNumberOfWheels());
	}

}
