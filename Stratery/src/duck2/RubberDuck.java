package duck2;

public class RubberDuck extends Duck {

	@Override
	public void dislay() {
		System.out.println("I am Rubber Duck");
	}

	public void quack() {
		System.out.println("Squick .. Squick");
	}
	
	public void fly() {
		System.out.println("nothing");
	}

}
