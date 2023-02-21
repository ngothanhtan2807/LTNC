package week_11_12_24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SubjectPanel extends JPanel {
	JPanel topSub, midSub, bottomSub;

	JLabel lbMssv, lbHoten, lbMaMon, lbTenmon;
	JTextField txtMssv, txtHoten, txtMaMon, txtTenMon;
	JPanel pnMssv, pnHoten, pnMaMon, pnTenMon;

	JTextArea area;
	JScrollPane scrollPanel;

	JButton btnAddSub, btnFindStu;
	JPanel midPan;
	

	public SubjectPanel() {
		setLayout(new BorderLayout());

		topSub = new TopSubjectPanel();
		midSub = new MidPanel();
		bottomSub = new BottomPanel();
		add(topSub, BorderLayout.NORTH);
		add(midSub, BorderLayout.CENTER);
		add(bottomSub, BorderLayout.SOUTH);
	}

	class TopSubjectPanel extends JPanel {

		public TopSubjectPanel() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

			Border topBorder = BorderFactory.createLineBorder(Color.gray);
			setBorder(BorderFactory.createTitledBorder(topBorder, "Thêm môn học"));

			Dimension forText = new Dimension(100, 20);

			pnMssv = new JPanel();
//			pnMssv.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pnHoten = new JPanel();
////			pnHoten.setLayout(new FlowLayout(FlowLayout.CENTER));
			pnMaMon = new JPanel();
//			pnMaMon.setLayout(new FlowLayout(FlowLayout.CENTER));
			pnTenMon = new JPanel();
//			pnTenMon.setLayout(new FlowLayout(FlowLayout.CENTER));
			lbMssv = new JLabel("MSSV");

			lbMssv.setPreferredSize(forText);
			lbHoten = new JLabel("Họ Tên");
			lbHoten.setPreferredSize(forText);
			lbMaMon = new JLabel("Mã Môn");
			lbMaMon.setPreferredSize(forText);
			lbTenmon = new JLabel("Tên Môn Học");
			lbTenmon.setPreferredSize(forText);

			txtMssv = new JTextField();
			txtMssv.setPreferredSize(forText);
			txtHoten = new JTextField();
			txtHoten.setPreferredSize(forText);
			txtHoten.setEditable(false);
			txtMaMon = new JTextField();
			txtMaMon.setPreferredSize(forText);
			txtTenMon = new JTextField();
			txtTenMon.setPreferredSize(forText);

			pnMssv.add(lbMssv);
			pnMssv.add(txtMssv);

			pnHoten.add(lbHoten);
			pnHoten.add(txtHoten);

			pnMaMon.add(lbMaMon);
			pnMaMon.add(txtMaMon);

			pnTenMon.add(lbTenmon);
			pnTenMon.add(txtTenMon);

			add(pnMssv);
			add(pnHoten);
			add(pnMaMon);
			add(pnTenMon);

		}
	}

	class MidPanel extends JPanel {

		public MidPanel() {
			Border border = BorderFactory.createLineBorder(Color.GRAY);
			setBorder(BorderFactory.createTitledBorder(border, "Thao tác"));
			midPan = new JPanel();
			btnAddSub = new JButton("Thêm Môn Học");
			btnFindStu = new JButton("Tìm Sinh Viên");
			btnAddSub.setPreferredSize(new Dimension(150, 30));
			btnFindStu.setPreferredSize(new Dimension(150, 30));

			midPan.add(btnAddSub);
			midPan.add(btnFindStu);
			add(midPan, BorderLayout.CENTER);

			btnAddSub.addActionListener(new MyListener());
			btnFindStu.addActionListener(new MyListener());
		}
	}

	class BottomPanel extends JPanel {

		public BottomPanel() {
			area = new JTextArea(10, 0);
			area.setEditable(false);
			String title = "ID\t\tTên môn học\t\t\tĐiểm\t\n";

			area.append(title);

			scrollPanel = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			add(scrollPanel, BorderLayout.SOUTH);
		}
	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (!txtMssv.getText().equalsIgnoreCase("")) {
				if (e.getSource() == btnFindStu) {
					area.setText("");
					area.append("STT\t\tTên môn học\t\t\tĐiểm\t\n");
					if (MyPanel.manager.checkStudentExits(txtMssv.getText())) {
						Student s = MyPanel.manager.findById(txtMssv.getText());
						txtHoten.setText(s.getName());
						for (int i = 0; i < s.getListSub().size(); i++) {
							area.append(i + 1 + "\t\t" + s.getListSub().get(i).getName() + "\t\t\t"
									+ s.getListSub().get(i).getMark() + "\t\n");

						}
					}

				}

				if (e.getSource() == btnAddSub) {
					area.setText("");
					area.append("STT\t\tTên môn học\t\t\tĐiểm\t\n");
					
						Student s = MyPanel.manager.findById(txtMssv.getText());
						MyPanel.manager.addSubject(s.getId(), txtMaMon.getText(), txtTenMon.getText());
						
						for (int i = 0; i < s.getListSub().size(); i++) {
							System.out.println(s.getListSub().size());
							area.append(i + 1 + "\t\t" + s.getListSub().get(i).getName() + "\t\t\t"
									+ s.getListSub().get(i).getMark() + "\t\n");

						
					}
				}
			}

		}
	}
}
