package duck3;

import org.junit.Test;

public class TestDrive {

	@Test
	public void main() {
		Duck marllard = new MallardDuck();
		Duck redHead = new RedHeadDuck();
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();

		marllard.dislay();
		marllard.swim();
		((Quackable) marllard).quack();
		((Flyable) marllard).fly();
		
		System.out.println("---------------------------------");
		redHead.dislay();
		redHead.swim();
		((Quackable) marllard).quack();
		((Flyable) redHead).fly();
		
		System.out.println("---------------------------------");
		rubber.dislay();
		rubber.swim();
		((Quackable) rubber).quack();
		
		System.out.println("---------------------------------");
		decoy.dislay();
		decoy.swim();
		((Quackable) decoy).quack();


	}

}
