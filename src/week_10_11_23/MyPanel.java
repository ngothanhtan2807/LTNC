package week_10_11_23;

import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	public JMenu file,shape;
	public JMenuBar menubar;
	public JMenuItem exit, line, rectangle, circle;
public MyPanel() {
	createMenuBar();
	
	
}
public void createMenuBar() {
	 menubar = new JMenuBar();
	 file = new JMenu("File");
	 shape = new JMenu("Shape");
	menubar.add(file);
	menubar.add(shape);
	
	exit = new JMenuItem("Exit");
	line = new JMenuItem("Line");
	rectangle = new JMenuItem("Rectangle");
	circle = new JMenuItem("Circle");
	
	file.add(exit);
	shape.add(line);
	shape.add(rectangle);
	shape.add(circle);
}
public JMenuBar getMenuBar() {
	return menubar;
}
}
