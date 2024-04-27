package lab7.ex2;

import junit.framework.TestCase;

public class LightAdapterTestDrive extends TestCase {

	public void testButtonControlsLight() throws Exception {
		Light l = new Light();
		LightAdapter la = new LightAdapter(l);
		Button b = new Button(la);
		b.press();
		assertTrue(l.isOn());
	}

	public void testButtonControlsLightThroughClassAdapter() {
		LightClassAdapter lca = new LightClassAdapter();
		Button b = new Button(lca);
		b.press();
		assertTrue(lca.isOn());
	}
}
