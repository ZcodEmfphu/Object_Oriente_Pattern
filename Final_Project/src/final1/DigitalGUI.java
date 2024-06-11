package final1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class DigitalGUI extends JFrame {

	private int h, m, s;
	private DigitalClock digitalClock;
	private JLabel clock = new JLabel();
	private Timer timer = new Timer(1000, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			h = digitalClock.getH();
			m = digitalClock.getM();
			s = digitalClock.getS();
			clock.setText(h + ":" + m + ":" + s);
		}
	});

	public DigitalGUI(DigitalClock digitalClock) {
		super();
		this.digitalClock = digitalClock;
		setLayout(new FlowLayout(FlowLayout.CENTER));

		h = digitalClock.getH();
		m = digitalClock.getM();
		s = digitalClock.getS();
		clock.setText(h + ":" + m + ":" + s);
		Font font = new Font("Serif", Font.BOLD, 40);
		clock.setFont(font);
		add(clock);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Digital Clock");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setVisible(true);
		timer.start();

	}

	public static void main(String[] args) {
		ClockTime clockTime = new ClockTimer();
		DigitalClock digitalClock = new DigitalClock(clockTime);
		new DigitalGUI(digitalClock);

	}

}
