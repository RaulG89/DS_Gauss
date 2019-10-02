package editor.tool.create;

import java.awt.Point;

import editor.Drawing;

public class CreateTriangle extends AbstractCreate {
	private Point c;
	private int x;
	private int y;

	public CreateTriangle(Drawing drawing) {
		super(drawing);
	}

	@Override
	public void pulse(int x, int y) {
		if (this.a == null) {
			super.pulse(x, y);
		} else {
			this.c = new Point(x, y);
		}
	}

	@Override
	public void move(int x, int y) {
		if (this.b == null) {
			super.move(x, y);
		} else {
			this.x = x;
			this.y = y;
		}
	}

	@Override
	public void drop() {

	}

}
