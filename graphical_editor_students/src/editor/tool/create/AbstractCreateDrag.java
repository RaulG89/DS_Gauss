package editor.tool.create;

import java.awt.Point;

import editor.Editor;
import editor.tool.AbstractTool;

public abstract class AbstractCreateDrag extends AbstractTool {
	protected Point a;
	protected Point b;

	public AbstractCreateDrag(Editor editor) {
		super(editor);
	}

	@Override
	public void pulse(int x, int y) {
		this.a = new Point(x, y);
		System.out.println("Posición del cursor: " + x + ", " + y);
	}

	@Override
	public void move(int x, int y) {
		this.b = new Point(x, y);
		System.out.println("Posición del cursor: " + x + ", " + y);
	}
}
