package lab6.more.ex2;

public class CartPartsFactory implements VehiclePartsFactory {

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new CarEngine();
	}

	@Override
	public Tire createTire() {
		// TODO Auto-generated method stub
		return new CarTire();
	}

}
