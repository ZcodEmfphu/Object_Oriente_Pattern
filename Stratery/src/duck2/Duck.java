package duck2;

public abstract class Duck {

	public void swim() {
		System.out.println("I'm swimming");
	}

	public void quack() {
		System.out.println("Quack, quack ...");
	}

	public abstract void dislay();

	public void fly() {
		System.out.println("I'm flying");
	}
}
