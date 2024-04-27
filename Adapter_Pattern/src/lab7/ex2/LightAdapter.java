package lab7.ex2;

public class LightAdapter implements Switchable {
	private Light light;

	public LightAdapter(Light light) {
		this.light = light;
	}

	public void turnOn() {
		light.on();
	}
}
