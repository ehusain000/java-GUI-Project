import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class DrawShapeTest {

	public static void main(String[] args) {
		
		Shape c1 = new DrawCircle(250, 250, Color.PINK, 250);
		//Shape p1 = new DrawPolygon(250, 250, Color.WHITE, 6,250);		
			
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(c1);
		//application.add(p1);
		
		application.setSize(500, 500);
		application.setVisible(true);
	}
}
