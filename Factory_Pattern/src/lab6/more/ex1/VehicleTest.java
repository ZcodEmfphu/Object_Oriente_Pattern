package lab6.more.ex1;

public class VehicleTest {

	public static void main(String[] args) {

		VehicleFactory carFactory = new CarFactory();
		VehicleFactory truckFactory = new TruckFactory();
		VehicleFactory motocycleFactory = new MotorcycleFactory();

		Vehicle vehicle = carFactory.createVehicle();
		System.out.println(vehicle);

		vehicle = truckFactory.createVehicle();
		System.out.println(vehicle);
		
		vehicle = motocycleFactory.createVehicle();
		System.out.println(vehicle);

	}
}
