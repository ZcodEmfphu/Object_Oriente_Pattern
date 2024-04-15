package lab3.duck4;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a read RedHead Duck");
	}

}
