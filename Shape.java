import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Shape extends JPanel {
	private int x;
	private int y;
	private int dx;
	private int dy;
	private Color color;
	
	//constructor
	public Shape(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	
	//getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getDx() {
		return dx;
	}
	public int getDy() {
		return dy;
	}
	public Color getColor() {
		return color;
	}
	
	
	//setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setDx(int dx) {
		this.dx = dx;
	}
	public void setDy(int dy) {
		this.dy = dy;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public  void shiftXY()
	{
		int dx = getWidth() / 2;
		dx = dx + getX();
		int dy = getHeight() / 2;
		dy = dy + getY();
	}

	public abstract void draw(Graphics g);
	
	
	
	

}
