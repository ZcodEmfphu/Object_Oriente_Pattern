package lab3.duck3;

public class RedHeadDuck extends Duck implements Quackable, Flyable {

	@Override
	public void dislay() {
		System.out.println("I am RedHead Duck");
	}

	@Override
	public void quack() {
		System.out.println("Quack ... Quack");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying");

	}
}
