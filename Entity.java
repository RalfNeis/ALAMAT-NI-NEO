package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {
	//position
	public int worldX, worldY;
	public int speed;
	//movement
	public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
	public String direction;
	//animation
	public int spriteCounter = 0;
	public int spriteNum = 1;
	//hitbox
	public Rectangle solidArea;
	public int solidAreaDefaultX, solidAreaDefaultY;
	public boolean collisionOn = false;
}
