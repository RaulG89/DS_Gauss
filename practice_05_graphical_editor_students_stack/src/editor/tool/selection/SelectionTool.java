package editor.tool.selection;

import java.awt.Point;

import editor.Editor;
import editor.tool.AbstractTool;
import figures.Figure;

public class SelectionTool extends AbstractTool {

	private Point init;
	private Point finish;
	private Figure figure;

	public SelectionTool(Editor editor) {
		super(editor);
		System.out.println("Seleccionada herramienta de selección");
	}

	@Override
	public void pulse(int x, int y) {
		this.init = new Point(x, y);
		System.out.println("Posición del cursor: " + x + ", " + y);
		this.figure = this.editor.getDrawing().getSelected(x, y);
		System.out.println("Figura seleccionada: " + this.figure);
	}

	@Override
	public void move(int x, int y) {
		this.finish = new Point(x, y);
		System.out.println("Cursor movido: " + x + ", " + y);
	}

	@Override
	public void drop() {
		if (figure == null) {
			System.out.println("No hay ninguna figura seleccionada");
		} else {
			int x = this.finish.x - this.init.x;
			int y = this.finish.y - this.init.y;
			this.figure.move(x, y);
			System.out.println("Figura : " + this.figure);
			saveChange(figure, x, y);
		}
	}

}
