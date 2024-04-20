package lab6.pizzaSimpleFactory;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> topping = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + getName());
	}

	public void bake() {
		System.out.println("Baking " + getName());
	}

	public void cut() {
		System.out.println("Cuting " + getName());
	}

	public void box() {
		System.out.println("Boxing " + getName());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("---- " + name + " ----\n");
		sb.append(dough + "\n");
		sb.append(sauce + "\n");
		for (int i = 0; i < topping.size(); i++) {
			sb.append(topping.get(i) + "\n");
		}
		return sb.toString();
	}

}
