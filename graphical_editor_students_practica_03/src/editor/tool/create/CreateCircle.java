package editor.tool.create;

import editor.Editor;
import figures.Circle;

public class CreateCircle extends AbstractCreateDrag {
	public CreateCircle(Editor editor) {
		super(editor);
		System.out.println("Seleccionada herramienta de creación de circulos");
	}

	@Override
	public void drop() {
		editor.getDrawing().add(new Circle(a, b));
		System.out.println("Creado nuevo circulo");
	}
}
