package lab3.duck4;

public class ModeDuck extends Duck {

	public ModeDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");

	}
}
