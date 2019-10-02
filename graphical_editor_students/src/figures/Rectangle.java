package figures;

import java.awt.Point;

public class Rectangle implements Figure {
	private Point corner;
	private double width;
	private double height;
	private Point finalPoint;

	public Rectangle(Point corner, double width, double height) {
		this.corner = corner;
		this.width = width;
		this.height = height;
		this.finalPoint = new Point();
		this.finalPoint.setLocation(this.corner.getX() + width,
				this.corner.getY() + height);
	}

	@Override
	public void draw() {
		toString();
	}

	@Override
	public boolean isSelected(int x, int y) {
		return (corner.x <= x && x <= corner.x + width)
				&& (corner.y <= y && y <= corner.y + height);
	}

	@Override
	public String toString() {
		return "Square [corner=" + corner + ", width=" + width + ", height="
				+ height + "]";
	}
}
