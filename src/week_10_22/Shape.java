package week_10_22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Shape {
	private Point point,finalPoint;
	private int width, height;
	private boolean isFill;
	private Color color;
	private int type;

	public Shape(Point point, boolean isFill, Color color, int type) {

		this.point = point;
		this.finalPoint = point;
		this.width = 0;
		this.height = 0;
		this.isFill = isFill;
		this.type = type;
		this.color = color;

	}

	public void resize(int x1, int y1) {
		int reverseX = (int) (x1 - finalPoint.getX());
		int reverseY = (int) (y1 - finalPoint.getY());

		this.width = Math.abs(reverseX);
		this.height = Math.abs(reverseY);
		
		if(reverseX < 0) {
			Point p = new Point();
			p.setLocation(finalPoint.getX() - width, finalPoint.getY());
			this.setPoint(p);
		}
		if(reverseY < 0) {
			Point p = new Point();
			p.setLocation(finalPoint.getX(), finalPoint.getY()-height);
			this.setPoint(p);
		}
		if(reverseX < 0 && reverseY < 0) {
			Point p = new Point();
			p.setLocation(x1, y1);
			this.setPoint(p);
		}
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Point getFinalPoint() {
		return finalPoint;
	}

	public void setFinalPoint(Point finalPoint) {
		this.finalPoint = finalPoint;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isFill() {
		return isFill;
	}

	public void setFill(boolean isFill) {
		this.isFill = isFill;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		switch (type) {
		case 1: {
			if (isFill) {
				g.fillRect((int) point.getX(), (int) point.getY(), width, height);
			} else {
				g.drawRect((int) point.getX(), (int) point.getY(), width, height);
			}
			break;
		}
		case 2: {
			if (isFill) {
				g.fillOval((int) point.getX(), (int) point.getY(), width, height);
			} else {
				g.drawOval((int) point.getX(), (int) point.getY(), width, height);
			}
			break;
		}
		}

	}
}