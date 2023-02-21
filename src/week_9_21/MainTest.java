package week_9_21;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainTest extends JFrame{
public MainTest(){
	setLayout(new BorderLayout());
	
	add(new MyPanel_21());
	
	setTitle("App Paint");
	setSize(500, 300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}
public static void main(String[] args) {
	new MainTest();
}
}