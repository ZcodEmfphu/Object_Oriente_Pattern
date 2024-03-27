package lab3.duck1;

import org.junit.Test;

public class TestDriveDuck1 {

	@Test
	public void main() {
		Duck marllard = new MallardDuck();
		Duck redHead = new RedHeadDuck();
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();

		marllard.dislay();
		marllard.swim();
		marllard.quack();
		System.out.println("---------------------------------");
		redHead.dislay();
		redHead.swim();
		redHead.quack();
		System.out.println("---------------------------------");
		rubber.dislay();
		rubber.swim();
		rubber.quack();
		System.out.println("---------------------------------");
		decoy.dislay();
		decoy.swim();
		decoy.quack();

	}

}
