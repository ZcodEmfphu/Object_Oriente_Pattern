package duck3;

public class DecoyDuck extends Duck {

	@Override
	public void dislay() {
		System.out.println("I am Decoy Duck");
	}

	public void quack() {
		System.out.println("nothing");
	}

	public void fly() {
		System.out.println("nothing");
	}
}
