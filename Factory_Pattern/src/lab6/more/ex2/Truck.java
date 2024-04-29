package lab6.more.ex2;

public class Truck extends Vehicle {
	
	private VehiclePartsFactory vehiclePartsFactory;

	public Truck(VehiclePartsFactory vehiclePartsFactory) {
		super();
		this.vehiclePartsFactory = vehiclePartsFactory;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving " + name);
		engine = vehiclePartsFactory.createEngine();
		tire = vehiclePartsFactory.createTire();
	}

}
