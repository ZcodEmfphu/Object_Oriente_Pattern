package lab6.more.ex2;

public class TruckPartsFactory implements VehiclePartsFactory {

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new TruckEngine();
	}

	@Override
	public Tire createTire() {
		// TODO Auto-generated method stub
		return new TruckTire();
	}

}
