package duck4;

import org.junit.Test;

public class TestDrive {

	@Test
	public void main() {
		Duck marllard = new MallardDuck();
		Duck redHead = new RedHeadDuck();
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();

		marllard.display();
		marllard.performQuack();
		marllard.performFly();
		marllard.swim();

		System.out.println("---------------------------------");
		redHead.display();
		redHead.performFly();
		redHead.performQuack();
		redHead.swim();

		System.out.println("---------------------------------");
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		rubber.swim();

		System.out.println("---------------------------------");
		decoy.display();
		decoy.performFly();
		decoy.performQuack();
		decoy.swim();

	}

}
