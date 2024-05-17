package lab8.ex6;

public class BeverageTestDrive {

	public static void main(String[] args) {
		BeverageMaker coffee = new CoffeeMaker();
		BeverageMaker tea = new TeaMaker();

		System.out.println("Making coffee");
		coffee.makeBeverage();

		System.out.println("\nMaking coffee");
		tea.makeBeverage();
	}
}
