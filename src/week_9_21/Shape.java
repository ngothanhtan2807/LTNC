package week_9_21;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Shape {
	private int x, y;
	private boolean isFill;
	private Color color;
	private int type;

	public Shape(int x, int y, boolean isFill, Color color, int type) {
		super();
		this.x = x;
		this.y = y;
		this.isFill = isFill;
		this.type = type;
		this.color = color;

	}

	public void setFill(boolean isFill) {
		this.isFill = isFill;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isFill() {
		return isFill;
	}

	public int getType() {
		return type;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		switch (type) {
		case 1: {
			if (isFill) {
				g.fillRect(x, y, 10, 10);
			} else {
				g.drawRect(x, y, 10, 10);
			}
			break;
		}
		case 2: {
			if (isFill) {
				g.fillOval(x, y, 10, 10);
			} else {
				g.drawOval(x, y, 10, 10);
			}
			break;
		}
		}

	}
}