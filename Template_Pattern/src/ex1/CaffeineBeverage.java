package ex1;

public abstract class CaffeineBeverage {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void brew();

	public void boilWater() {
		System.out.println("Boiling water by MinhPhu");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup by MinhPhu");
	}

	public abstract void addCondiments();
}
