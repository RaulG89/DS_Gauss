package figures;

import java.awt.Point;

public class Triangle implements Figure {
	private Point v1;
	private Point v2;
	private Point v3;

	public Triangle(Point v1, Point v2, Point v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	@Override
	public void draw() {
		toString();
	}

	@Override
	public boolean isSelected(int x, int y) {
		Point posicion = new Point(x, y);
		return posicion.equals(v1) || posicion.equals(v2)
				|| posicion.equals(v3);
	}

	@Override
	public String toString() {
		return "Triangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}

	@Override
	public void move(int x, int y) {
		v1.translate(x, y);
		v2.translate(x, y);
		v3.translate(x, y);
	}

}
