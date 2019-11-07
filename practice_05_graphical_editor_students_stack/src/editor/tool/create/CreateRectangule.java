package editor.tool.create;

import editor.Editor;
import figures.Rectangle;

public class CreateRectangule extends AbstractCreateDrag {

	public CreateRectangule(Editor editor) {
		super(editor);
		System.out.println("Seleccionada herramienta de creación de"
				+ " rectángulos");
	}

	@Override
	public void drop() {
		Rectangle figure = new Rectangle(a, b.getX(), b.getY());
		editor.getDrawing().add(figure);
		System.out.println("Creado nuevo rectángulo");
		saveChange(figure);
	}
}
