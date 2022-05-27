import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public  class DrawPolygon extends Shape
{
	private int N;
	private int radius; //rad. of circle
	
	//polygon Constructor
	public DrawPolygon(int x, int y, Color color, int N,int radius) {
		super(x, y, color);
		this.N = N;
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
		
		Polygon p = new Polygon();
		
	    for (int i = 0; i < N; i++)
	    {
	      p.addPoint((int) (getX()+ 200 * Math.cos(i * 2 * Math.PI / N)),
	          (int) (getY() + 200 * Math.sin(i * 2 * Math.PI / N)));
	    }
	    
		Color color = getColor();
		g.setColor(color);
		g.fillPolygon(p);
	}

}
