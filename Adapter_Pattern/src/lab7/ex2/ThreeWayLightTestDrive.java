package lab7.ex2;

import junit.framework.TestCase;

public class ThreeWayLightTestDrive extends TestCase {

	public void testThreeWayLight() throws Exception {

		ThreeWayLight twl = new ThreeWayLight();
		ThreeWayAdapter twa = new ThreeWayAdapter(twl);
		Button b = new Button(twa);
		assertEquals(0, twl.getBrightness());
		b.press();
		assertEquals(1, twl.getBrightness());
		b.press();
		assertEquals(2, twl.getBrightness());
		b.press();
		assertEquals(3, twl.getBrightness());
		b.press();
		assertEquals(0, twl.getBrightness());
	}
}
