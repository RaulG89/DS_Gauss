package editor.tool.create;

import editor.Drawing;
import figures.Circle;

public class CreateCircle extends AbstractCreate {
	public CreateCircle(Drawing drawing) {
		super(drawing);
	}

	@Override
	public void drop() {
		drawing.add(new Circle(a, b));
	}
}
