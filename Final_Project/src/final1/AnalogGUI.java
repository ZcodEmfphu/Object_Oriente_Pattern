package final1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.Timer;

public class AnalogGUI extends JFrame {

	private int h = 0;
	private int m = 0;
	private int s = 0;
	private AnalogClock analogClock;

	private Timer timer = new Timer(1000, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			h = analogClock.getH();
			m = analogClock.getM();
			s = analogClock.getS();
			repaint();
		}
	});

	public AnalogGUI(AnalogClock analogClock) {
		this.analogClock = analogClock;

		h = Calendar.getInstance().get(Calendar.HOUR);
		m = Calendar.getInstance().get(Calendar.MINUTE);
		s = Calendar.getInstance().get(Calendar.SECOND);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Analog Clock");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		timer.start();
	}

	public void setH(int h) {
		this.h = h;
	}

	public void setM(int m) {
		this.m = m;
	}

	public void setS(int s) {
		this.s = s;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);

		graphics.drawOval(50, 50, 300, 300);

		int centerX = 200;
		int centerY = 200;
		int dimentionHour = 80;
		int dimentionMinute = 100;
		int dimentionSecond = 130;

		double angleH = Math.toRadians((h % 12) * 30);
		double angleM = Math.toRadians(m * 6);
		double angleS = Math.toRadians(s * 6);

		int xH = centerX + (int) (dimentionHour * Math.sin(h * Math.PI / 6));
		int yH = centerY - (int) (dimentionHour * Math.cos(h * Math.PI / 6));

		int xM = centerX + (int) (dimentionMinute * Math.sin(m * 6 * (Math.PI / 180)));
		int yM = centerY - (int) (dimentionMinute * Math.cos(m * 6 * (Math.PI / 180)));

		int xS = centerX + (int) (dimentionSecond * Math.sin(s * 6 * (Math.PI / 180)));
		int yS = centerY - (int) (dimentionSecond * Math.cos(s * 6 * (Math.PI / 180)));

		graphics.setColor(Color.RED);
		graphics.drawLine(centerX, centerY, xH, yH);

		graphics.setColor(Color.BLUE);
		graphics.drawLine(centerX, centerY, xM, yM);

		graphics.setColor(Color.BLACK);
		graphics.drawLine(centerX, centerY, xS, yS);
	}

	public static void main(String[] args) {
		ClockTime clockTime = new ClockTimer();
		AnalogClock analogClock = new AnalogClock(clockTime);
		new AnalogGUI(analogClock);
	}

}
