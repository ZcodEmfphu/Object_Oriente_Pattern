package lab3.duck4;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Quick();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am Rubber Duckie");
	}

}
