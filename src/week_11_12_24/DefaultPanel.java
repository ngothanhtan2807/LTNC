package week_11_12_24;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DefaultPanel extends JPanel{
	JLabel lable;
public DefaultPanel() {
	lable = new JLabel("Quan ly sinh vien khoa cong nghe thong tin");
	lable.setFont(new Font(null, Font.CENTER_BASELINE, 15));
	lable.setHorizontalAlignment(JLabel.CENTER);//can giua cua jpanel
	
	add(lable, BorderLayout.CENTER);
	
}
}
