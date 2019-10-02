package editor.tool.create;

import editor.Drawing;
import figures.Rectangle;

public class CreateSquare extends AbstractCreate {

	public CreateSquare(Drawing drawing) {
		super(drawing);
	}

	@Override
	public void drop() {
		drawing.add(new Rectangle(a, b.getX(), b.getY()));
	}
}
