package lab5.ex3;

import java.awt.BorderLayout;

import javax.swing.JComponent;

public class Decorator extends JComponent {

	public Decorator(JComponent c) {
		setLayout(new BorderLayout());
		add("Center", c);
	}

}
