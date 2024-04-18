package lab5.Ex2;

public abstract class Beverage {

	public String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost();

}
