package figures;

import java.awt.Point;

public class Rectangle implements Figure {
	private Point corner;
	private double width;
	private double height;

	public Rectangle(Point corner, double width, double height) {
		this.corner = corner;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(toString());
	}

	@Override
	public boolean isSelected(int x, int y) {
		return (corner.x <= x && x <= corner.x + width)
				&& (corner.y <= y && y <= corner.y + height);
	}

	@Override
	public void move(int x, int y) {
		corner.translate(x, y);
	}

	@Override
	public String toString() {
		return "Square [corner=" + corner + ", width=" + width + ", height="
				+ height + "]";
	}
}
