package week_9_20;

import javax.swing.JFrame;

public class MainTest extends JFrame{
public MainTest(){
	getContentPane().add(new MyPanel());
	setTitle("SimplePaint");
	setSize(500, 300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}
public static void main(String[] args) {
	new MainTest();
}
}
