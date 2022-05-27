import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawCircle extends Shape 
{
	private int radius; //rad. of circle
	
	//circle constructor
	public DrawCircle(int x, int y, Color color, int radius) {
		super(x, y, color);
		this.radius = radius;
	}
	
	//getters
	public int getRadius() {
		return radius;
	}

	//setters
	public void setRadius(int radius) {
		this.radius = radius;
	}

@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		Color color = getColor();
		g.setColor(color);
		g.fillArc(getX() + getDx() - getRadius(), getY() + getDy() -getRadius(),getRadius() * 2, getRadius() * 2, 0, 360);
		
	}
	
}