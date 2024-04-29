package lab6.more.ex2;

public class VehiclePartsTestDrive {

	public static void main(String[] args) {
		VehicleFactory carFactory = new CarFactory();
		VehicleFactory truckFactory = new TruckFactory();

		Vehicle vehicle = carFactory.createVehicle();
		System.out.println(vehicle);

		vehicle = truckFactory.createVehicle();
		System.out.println(vehicle);

	}

}
