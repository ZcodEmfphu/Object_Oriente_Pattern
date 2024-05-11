package ex1;

public class BeverageTestDrive {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		Tea tea = new Tea();
		HotChocolate hotChocolate = new HotChocolate();

		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking hot chocolate...");
		hotChocolate.prepareRecipe();
	}
}
