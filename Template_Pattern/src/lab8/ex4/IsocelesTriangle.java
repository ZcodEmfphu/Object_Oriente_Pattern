package lab8.ex4;

import java.awt.Graphics;
import java.awt.Point;

public class IsocelesTriangle extends Triangle {
	Point newc;
	int newcx, newcy;
	int incr;

	public IsocelesTriangle(Point a, Point b, Point c) {
		super(a, b, c);
		double dx1 = b.x - a.x;
		double dy1 = b.y - a.y;
		double dx2 = c.x - b.x;
		double dy2 = c.y - b.y;
		double side1 = calcSide(dx1, dy1);
		double side2 = calcSide(dx2, dy2);
		if (side2 < side1)
			incr = -1;
		else
			incr = 1;
		double slope = dy2 / dx2;
		double intercept = c.y - slope * c.x;
		newcx = c.x;
		newcy = c.y;
		while (Math.abs(side1 - side2) > 1) {
			newcx += incr;

			newcy = (int) (slope * newcx + intercept);
			dx2 = newcx - b.x;
			dy2 = newcy - b.y;
			side2 = calcSide(dx2, dy2);
		}
		newc = new Point(newcx, newcy);
	}

	private double calcSide(double dx, double dy) {
		return Math.sqrt(dx * dx + dy * dy);
	}

	public Point draw2ndLine(Graphics g, Point b, Point c) {
		g.drawLine(b.x, b.y, newc.x, newc.y);
		return newc;
	}
}
