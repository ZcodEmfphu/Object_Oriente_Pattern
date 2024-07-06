package model;

import javax.swing.ImageIcon;

public class ITem_Bomb extends Item {

	public ITem_Bomb(int x, int y, int type, String image) {
		super();
		this.x = x;
		this.y = y;
		this.type = type;
		this.img = new ImageIcon(getClass().getResource(image)).getImage();
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
		timeLine = 250;
	}

}
