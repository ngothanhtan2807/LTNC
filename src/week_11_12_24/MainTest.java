package week_11_12_24;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainTest extends JFrame{
	private JMenuBar menubar;
	private JMenu file, quanlysinhvien;
	private JMenuItem exit, quanlydiem, quanlymonhoc, defaultItem;
	ActionListener itemAction ;
	MyPanel myPanel ;
	CardLayout cardLayout = new CardLayout();
public MainTest() {
	myPanel = new MyPanel();
	setJMenuBar(createMenuBar(myPanel));
	
	add(myPanel);
	
	setTitle("Khoa cong nghe thong tin");
	setSize(570, 500);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setResizable(false);
	
}

public JMenuBar createMenuBar(MyPanel myPanel) {
	ActionListener itemAction = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		myPanel.change(e.getActionCommand());
			
		}
	};
	menubar = new JMenuBar();
	file = new JMenu("File");
	file.setFont(new Font(null, Font.BOLD, 15));
	quanlysinhvien = new JMenu("Quan ly sinh vien");
	quanlysinhvien.setFont(new Font(null, Font.BOLD, 15));

	menubar.add(file);
	menubar.add(quanlysinhvien);

	exit = new JMenuItem("Exit");
	exit.setMnemonic(KeyEvent.VK_E);

	file.add(exit);

	quanlydiem = new JMenuItem("Quan ly diem");
	quanlydiem.setActionCommand("Mark");
	
	quanlydiem.addActionListener(itemAction );
	
	quanlymonhoc = new JMenuItem("Quan ly mon hoc");
	quanlymonhoc.setActionCommand("Subject");
	quanlymonhoc.addActionListener(itemAction);
	
	defaultItem = new JMenuItem("Default");
	defaultItem.setActionCommand("Default");
	defaultItem.addActionListener(itemAction);
	
	quanlysinhvien.add(defaultItem);
	quanlysinhvien.add(quanlydiem);
	quanlysinhvien.add(quanlymonhoc);
	return menubar;
}
public static void main(String[] args) {
	new MainTest();
}
}
