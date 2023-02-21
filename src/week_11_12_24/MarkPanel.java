package week_11_12_24;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MarkPanel extends JPanel {
	JLabel lbMssv, lbHoten, lbMonHoc, lbdiem;
	JTextField txtMssv, txtHoTen, txtDiem;
	JComboBox<String> listSub;
	JPanel pnMssv, pnHoTen, pnMonHoc, pnDiem, pnTop, pnMid, pnBot;
	String[] subject = { "" };
	JButton btnThemDiem, btnTimSinhVien;
	JTextArea area;
	JScrollPane scrollPane;
	

	public MarkPanel() {
		setLayout(new BorderLayout());
		pnTop = new TopPanel();
		pnMid = new MidPanel();
		pnBot = new BotPanel();
		add(pnTop, BorderLayout.NORTH);
		add(pnMid, BorderLayout.CENTER);
		add(pnBot, BorderLayout.SOUTH);
	}

	class TopPanel extends JPanel {
		public TopPanel() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			Border border = BorderFactory.createLineBorder(Color.GRAY);
			setBorder(BorderFactory.createTitledBorder(border, "Thêm môn học"));

			Dimension forTex = new Dimension(100, 20);
			Dimension forText = new Dimension(200, 20);
			listSub = new JComboBox<>(subject);
//			
			pnMssv = new JPanel();
			pnHoTen = new JPanel();
			pnMonHoc = new JPanel();
			pnDiem = new JPanel();

			lbMssv = new JLabel("MSSV");
			lbMssv.setPreferredSize(forTex);
			lbHoten = new JLabel("Họ tên");
			lbHoten.setPreferredSize(forTex);
			lbMonHoc = new JLabel("Môn học");
			lbMonHoc.setPreferredSize(forTex);
			lbdiem = new JLabel("Điểm");
			lbdiem.setPreferredSize(forTex);

			txtMssv = new JTextField();
			txtMssv.setPreferredSize(forText);
			txtHoTen = new JTextField();
			txtHoTen.setEditable(false);
			txtHoTen.setPreferredSize(forText);
			txtDiem = new JTextField();
			txtDiem.setPreferredSize(forText);
			listSub.setPreferredSize(forText);

			pnMssv.add(lbMssv);
			pnMssv.add(txtMssv);

			pnHoTen.add(lbHoten);
			pnHoTen.add(txtHoTen);

			pnMonHoc.add(lbMonHoc);
			pnMonHoc.add(listSub);

			pnDiem.add(lbdiem);
			pnDiem.add(txtDiem);

			add(pnMssv);
			add(pnHoTen);
			add(pnMonHoc);
			add(pnDiem);
		}
	}

	class MidPanel extends JPanel {
		JPanel pnMid;

		public MidPanel() {
			Border border = BorderFactory.createLineBorder(Color.GRAY);
			setBorder(BorderFactory.createTitledBorder(border, "Thao tác"));

			pnMid = new JPanel();
			btnThemDiem = new JButton("Thêm Điểm");
			btnThemDiem.setPreferredSize(new Dimension(150, 30));
			btnTimSinhVien = new JButton("Tìm Sinh Viên");
			btnTimSinhVien.setPreferredSize(new Dimension(150, 30));

			pnMid.add(btnThemDiem);
			pnMid.add(btnTimSinhVien);
			add(pnMid);
			btnThemDiem.addActionListener(new MyListener());
			btnTimSinhVien.addActionListener(new MyListener());
		}

	}

	class BotPanel extends JPanel {
		public BotPanel() {
			String title = "STT\t\tTên môn học\t\t\tĐiểm\t\n";
			area = new JTextArea(10, 0);
			area.append(title);
			scrollPane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			add(scrollPane);
		}
	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (!txtMssv.getText().equalsIgnoreCase("")) {
				if (e.getSource() == btnTimSinhVien) {
					listSub.removeAllItems();
					area.setText("");
					area.append("STT\t\tTên môn học\t\t\tĐiểm\t\n");
					if (MyPanel.manager.checkStudentExits(txtMssv.getText())) {
						Student s = MyPanel.manager.findById(txtMssv.getText());
						subject = new String[s.getListSub().size()];
						txtHoTen.setText(s.getName());
						for (int i = 0; i < s.getListSub().size(); i++) {
							subject[i] = s.getListSub().get(i).getId() + " " + s.getListSub().get(i).getName();
							area.append(i + 1 + "\t\t" + s.getListSub().get(i).getName() + "\t\t\t"
									+ s.getListSub().get(i).getMark() + "\t\n");
							listSub.addItem(subject[i]);

						}
					}
					

				}
				if (e.getSource() == btnThemDiem) {
					area.setText("");
					area.append("STT\t\tTên môn học\t\t\tĐiểm\t\n");
					double mark = Double.parseDouble(txtDiem.getText());

					Student s = MyPanel.manager.findById(txtMssv.getText());
					String id = (String) listSub.getSelectedItem();
					
					MyPanel.manager.addMark(s.getId(), id.split(" ")[0], mark);
					for (int i = 0; i < s.getListSub().size(); i++) {
						subject[i] = s.getListSub().get(i).getId() + " " + s.getListSub().get(i).getName();
						area.append(i + 1 + "\t\t" + s.getListSub().get(i).getName() + "\t\t\t"
								+ s.getListSub().get(i).getMark() + "\t\n");

					}
				}
			}
		}

	}
}
