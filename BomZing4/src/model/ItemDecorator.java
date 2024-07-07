package model;

import java.awt.Graphics2D;

public abstract class ItemDecorator extends Item {

	protected Item item;

	public ItemDecorator(Item item) {
		this.item = item;
	}

	@Override
	public void drawItem(Graphics2D g2d) {
		item.drawItem(g2d);
	}

	@Override
	public int getX() {
		return item.getX();
	}

	@Override
	public int getY() {
		return item.getY();
	}

	@Override
	public int getType() {
		return item.getType();
	}

	@Override
	public int getWidth() {
		return item.getWidth();
	}

	@Override
	public int getHeight() {
		return item.getHeight();
	}

	@Override
	public int getTimeLine() {
		return item.getTimeLine();
	}

	@Override
	public void setTimeLine(int timeLine) {
		item.setTimeLine(timeLine);
	}

	@Override
	public boolean isImpactItemVsBomber(Bomber bomber) {
		return item.isImpactItemVsBomber(bomber);
	}
}
