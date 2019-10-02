package editor.tool.create;

import java.awt.Point;

import editor.Drawing;
import editor.tool.Tool;

public abstract class AbstractCreate implements Tool {
	protected Point a;
	protected Point b;
	protected Drawing drawing;

	public AbstractCreate(Drawing drawing) {
		this.drawing = drawing;
	}

	@Override
	public void pulse(int x, int y) {
		this.a = new Point(x, y);
		move(x, y);
	}

	@Override
	public void move(int x, int y) {
		this.b = new Point(x, y);
	}
}
