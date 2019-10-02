package figures;

import java.awt.Point;

public class Circle implements Figure {
	private Point center;
	private double radio;

	public Circle(Point center, Point finalPoint) {
		this.center = center;
		this.radio = Point.distance(center.getX(), center.getY(),
				finalPoint.getX(), finalPoint.getY());
	}

	@Override
	public void draw() {
		toString();
	}

	@Override
	public boolean isSelected(int x, int y) {
		double distancia = Math
				.sqrt(Math.pow(x - center.x, 2) + Math.pow(y - center.y, 2));
		return distancia < radio;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radio=" + radio + "]";
	}

}
