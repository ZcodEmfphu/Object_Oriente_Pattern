package lab5_extra.ex1;

import org.junit.jupiter.api.Test;

class BeverageManageSystem {

	@Test
	public void beverageManageSystem() {
		Beverage coffee = new Coffee();
		coffee = new Milk(coffee);
		coffee = new Milk(coffee);
		coffee = new WhippedSCream(coffee);

		Beverage tea = new Tea();
		tea = new Sugar(tea);
		tea = new WhippedSCream(tea);

		System.out.println(coffee.getDescription() + ": $" + coffee.getCost());
		System.out.println(tea.getDescription() + ": $" + tea.getCost());

	}

}
