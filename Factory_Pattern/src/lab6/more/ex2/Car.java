package lab6.more.ex2;

public class Car extends Vehicle {
	
	private VehiclePartsFactory vehiclePartsFactory;

	public Car(VehiclePartsFactory vehiclePartsFactory) {
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
