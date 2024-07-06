package model;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ShoeDecorator extends ItemDecorator {

	private Image poisonImage;

	public ShoeDecorator(Item item, String poisonImagePath) {
		super(item);
		this.poisonImage = new ImageIcon(getClass().getResource(poisonImagePath)).getImage();
	}

	@Override
	public void drawItem(Graphics2D g2d) {
		super.drawItem(g2d);
		g2d.drawImage(poisonImage, item.getX(), item.getY(), null);
	}


	@Override
	public int getTimeLine() {
		return super.getTimeLine();
	}

	@Override
	public void setTimeLine(int timeLine) {
		super.setTimeLine(timeLine);
	}
}
