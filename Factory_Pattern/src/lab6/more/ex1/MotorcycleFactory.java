package lab6.more.ex1;

public class MotorcycleFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Motorcycle();
	}

}
