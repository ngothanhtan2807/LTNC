package week_11_12_24;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	

	JPanel subjectPanel, mainPanle, markPanel,defaultPanel;
	CardLayout cardLayout = new CardLayout();
	ActionListener itemAction;
	public static StudentManagement manager = new StudentManagement();
	public MyPanel() {
		setLayout(new BorderLayout());
		subjectPanel = new SubjectPanel();
		defaultPanel = new DefaultPanel();
		markPanel = new MarkPanel();
		mainPanle = new JPanel(cardLayout);
		mainPanle.add("Default", defaultPanel);
		mainPanle.add("Subject", subjectPanel);
		mainPanle.add("Mark", markPanel);
		
		add(mainPanle, BorderLayout.CENTER);
	}
public void change(String actionCommand) {
	cardLayout.show(mainPanle, actionCommand);
	System.out.println("----------"+actionCommand);
}
	
	
}
