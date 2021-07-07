package qa.garage;

public class App {

	public static void main(String[] args) {

		Garage motor = new Garage();

		Vehicle vehicle1 = new Motorbike(125, "Honda", 2, "Petrol");
		Vehicle vehicle2 = new Car(6300, "Mercedes", 4, "Coupe");
		Vehicle vehicle3 = new Bus(3000, "ADL", 8, "Electric", 50);

	}

}
