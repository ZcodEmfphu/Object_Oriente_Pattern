package final1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class AnalogGUI extends JFrame {

	private int h = 3;
	private int m = 30;
	private int s = 45;

	public AnalogGUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
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

		int xH = centerX + (int) (dimentionHour * Math.sin(angleH));
		int yH = centerY - (int) (dimentionHour * Math.cos(angleH));

		int xM = centerX + (int) (dimentionMinute * Math.sin(angleM));
		int yM = centerY - (int) (dimentionMinute * Math.cos(angleM));

		int xS = centerX + (int) (dimentionSecond * Math.sin(angleS));
		int yS = centerY - (int) (dimentionSecond * Math.cos(angleS));

		graphics.setColor(Color.RED);
		graphics.drawLine(centerX, centerY, xH, yH);

		graphics.setColor(Color.BLUE);
		graphics.drawLine(centerX, centerY, xM, yM);

		graphics.setColor(Color.green);
		graphics.drawLine(centerX, centerY, xS, yS);
	}

	public static void main(String[] args) {
		new AnalogGUI();
	}

}
