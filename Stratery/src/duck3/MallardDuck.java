package duck3;

public class MallardDuck extends Duck implements Quackable, Flyable {

	@Override
	public void dislay() {
		System.out.println("I am Marllard Duck");
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
