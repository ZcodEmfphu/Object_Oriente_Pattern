package lab6.more.ex2;

public class TruckFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		Vehicle vehicle = null;
		VehiclePartsFactory vehiclePartsFactory = new CartPartsFactory();
		// TODO Auto-generated method stub

		vehicle = new Car(vehiclePartsFactory);

		vehicle.setName("Truck vehicle");
		vehicle.drive();
		return vehicle;

	}

}
