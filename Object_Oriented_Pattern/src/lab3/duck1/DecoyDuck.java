package lab3.duck1;

public class DecoyDuck extends Duck {

	@Override
	public void dislay() {
		System.out.println("I am Decoy Duck");
	}

	public void quack() {
		System.out.println("nothing");
	}
}
