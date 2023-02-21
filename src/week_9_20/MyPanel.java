package week_9_20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
public MyPanel() {
	
}
@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g.setColor(Color.yellow);
		g.fillRect(70, 70, 90, 70);
		
		g.setColor(Color.BLUE);
		g.drawOval(20, 150, 60, 40);
		
		g.setColor(Color.red);
		g.fillArc(20, 150, 60, 40, 180, 30);
		
		g.setColor(Color.PINK);
		g.fillOval(160, 150, 60, 60);
	
	}
}
