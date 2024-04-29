package lab6.more.ex2;

public abstract class Vehicle {

	protected String name;
	protected Engine engine;
	protected Tire tire;

	public String getName() {
		return name;
	}
	

	public Engine getEngine() {
		return engine;
	}


	public Tire getTire() {
		return tire;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract void drive();

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (engine != null) {
			result.append(engine);
			result.append("\n");
		}
		if (tire != null) {
			result.append(tire);
			result.append("\n");
		}
		return result.toString();
	}
}
