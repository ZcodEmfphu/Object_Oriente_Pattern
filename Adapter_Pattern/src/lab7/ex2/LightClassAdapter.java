package lab7.ex2;

public class LightClassAdapter extends Light implements Switchable {
	
	public void turnOn() {
		on();
	}
}
