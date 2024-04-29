package lab6.more.ex1;

public abstract class Vehicle {

	protected String name;
	protected String type;
	protected String color;

	public String getName() {
		return name;
	}

	public void drive() {
		System.out.println("Driving by " + getName());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("---- " + name + " ----\n");
		sb.append(type + "\n");
		sb.append(color + "\n");
		return sb.toString();
	}
}
