package week_10_22;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyPanel_22 extends JPanel {
	private JPanel p1, p2, pNorth, pWest;
	public JButton btnRed, btnBlue, btnClear;
	private ButtonGroup btnGr1, btnGr2, btnGr0;
	private JRadioButton rbSq, rbOv, rbFill, rbOutLine, rbRed, rbBlue;
	private Color color;
	private boolean fill = false;
	private boolean started = false;
	boolean clear = false;
	public static int SQUARE = 1;
	public static int OVAL = 2;
	public static int NO_SHAPE = 0;
	private int type = MyPanel_22.NO_SHAPE;

	public ArrayList<Shape> listShape = new ArrayList<Shape>();

	public MyPanel_22() {
		setLayout(new BorderLayout());
		pNorth = new JPanel();
		pWest = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();

		btnGr0 = new ButtonGroup();
		rbRed = new JRadioButton("Red");
		rbRed.setActionCommand("RED");

		rbBlue = new JRadioButton("Blue");
		rbBlue.setActionCommand("BLUE");

		btnGr0.add(rbRed);
		btnGr0.add(rbBlue);

		btnGr1 = new ButtonGroup();
		btnGr2 = new ButtonGroup();

		rbSq = new JRadioButton("Square");

		rbOv = new JRadioButton("Oval");
		btnGr1.add(rbSq);
		btnGr1.add(rbOv);

		rbFill = new JRadioButton("Fill");
		rbFill.setActionCommand("Fill");

		rbOutLine = new JRadioButton("Out line");
		rbOutLine.setActionCommand("OutLine");

		btnGr2.add(rbFill);
		btnGr2.add(rbOutLine);

		p2.add(rbRed);
		p2.add(rbBlue);
		p2.add(rbSq);
		p2.add(rbOv);
		p2.add(rbFill);
		p2.add(rbOutLine);

		pNorth.add(p2);
		add(pNorth, BorderLayout.NORTH);
		pNorth.setBackground(Color.pink);

		btnClear = new JButton("Clear");
		pWest.setBackground(Color.pink);
		pWest.add(btnClear);
		add(pWest, BorderLayout.WEST);
		JPanel pnCenter = new Paint();
		pnCenter.setBackground(Color.white);
		add(pnCenter, BorderLayout.CENTER);
		pnCenter.addKeyListener(new CustomKey());

		rbRed.addActionListener(new MyListener());
		rbBlue.addActionListener(new MyListener());
		rbSq.addActionListener(new MyListener());
		rbOv.addActionListener(new MyListener());
		rbFill.addActionListener(new MyListener());
		rbOutLine.addActionListener(new MyListener());
		btnClear.addActionListener(new MyListener());
	}

	public void clear() {
		listShape = new ArrayList<Shape>();
		updateUI();
	}

	class Paint extends JPanel {
		public Paint() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseClicked(e);
					if (e.getButton() == MouseEvent.BUTTON1) {
						if (started) {
//							Shape last = listShape.get(listShape.size() - 1);
//							last.resize(e.getX(), e.getY());
							started = false;
//							repaint();
						} else {
							started = true;
							listShape.add(new Shape(new Point(e.getX(), e.getY()), fill, color, type));
						}
					}
				}

			});
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					super.mouseMoved(e);

					if (started) {
						Shape last = listShape.get(listShape.size() - 1);
						last.resize(e.getX(), e.getY());
						repaint();
					}
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
//			
			for (Shape s : listShape) {

				s.draw(g);
			}

		}

	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equalsIgnoreCase("Red")) {
				color = color.RED;
			}
			if (e.getActionCommand().equalsIgnoreCase("Blue")) {
				color = color.BLUE;
			}
			if (e.getActionCommand().equalsIgnoreCase("Fill")) {
				fill = true;
			}

			if (e.getActionCommand().equalsIgnoreCase("OutLine")) {
				fill = false;
			}
			if (e.getActionCommand().equalsIgnoreCase("Square")) {
				type = MyPanel_22.SQUARE;
			}

			if (e.getActionCommand().equalsIgnoreCase("Oval")) {
				type = MyPanel_22.OVAL;
			}
			if (e.getSource() == btnClear) {
				clear();
			}

		}
	}

	class CustomKey implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
}