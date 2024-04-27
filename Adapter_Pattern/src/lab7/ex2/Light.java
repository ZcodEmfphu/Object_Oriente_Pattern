package lab7.ex2;

public class Light {
	
	private boolean on;

	public void on() {
		System.out.println("Light turns on");
		on = true;
	}

	public void off() {
		System.out.println("Light turns off");
		on = false;
	}

	public boolean isOn() {
		return on;
	}
}
