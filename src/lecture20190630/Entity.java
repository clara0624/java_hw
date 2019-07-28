package lecture20190630;

import java.awt.Rectangle;

public class Entity {
	private int x,y;
	
	public int getX() {
		return x;
		}
	public int getY() {
		return y;
		}
	public void setX(int x) {
		this.x = x;
		}
	public void setY(int y) {
		this.y = y;
		}
	public void setPosition(int x,int y) {
		this.x = x;
		this.y = y;
		
	}
	public void move(int dx,int dy) {
		x += dx;
		y += dy;
	}
	public Rectangle getBound() {
		return new Rectangle(x, y,width,height);
	}


}
