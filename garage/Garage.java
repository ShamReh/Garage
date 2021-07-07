package qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public int calculatePrice() {
		int price = 0;
		for (Vehicle vehicle : vehicles) {
			price += vehicle.calculate();
		}

		return price;

	}

}
