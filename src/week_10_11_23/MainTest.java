package week_10_11_23;

import javax.swing.JFrame;

public class MainTest extends JFrame{
public MainTest() {
	setJMenuBar(new MyPanel().menubar);
	add(new MyPanel());
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
