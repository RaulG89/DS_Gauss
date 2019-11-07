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
		Circle figure = new Circle(a, b);
		editor.getDrawing().add(figure);
		System.out.println("Creado nuevo circulo");
		saveChange(figure);
	}
}
