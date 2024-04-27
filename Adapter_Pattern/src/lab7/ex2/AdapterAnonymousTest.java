package lab7.ex2;

import junit.framework.TestCase;

public class AdapterAnonymousTest extends TestCase {
	private Light l = new Light();

	public void testAnonymousInnerClassAdapter() throws Exception {
		Switchable s = new Switchable() {
			public void turnOn() {
				l.on();
			}
		};
		Button b = new Button(s);
		b.press();
		assertTrue(l.isOn());
	}
}
