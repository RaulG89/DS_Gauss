package editor.tool.selection;

import java.awt.Point;

import editor.Editor;
import editor.tool.AbstractTool;
import figures.Figure;

public class SelectionTool extends AbstractTool {

	private Point init;
	private Point finish;
	private Figure selected;

	public SelectionTool(Editor editor) {
		super(editor);
		System.out.println("Seleccionada herramienta de selección");
	}

	@Override
	public void pulse(int x, int y) {
		this.init = new Point(x, y);
		System.out.println("Posición del cursor: " + x + ", " + y);
		this.selected = this.editor.getDrawing().getSelected(x, y);
		System.out.println("Figura seleccionada: " + this.selected);
	}

	@Override
	public void move(int x, int y) {
		this.finish = new Point(x, y);
	}

	@Override
	public void drop() {
		if (selected == null) {
			System.out.println("No hay ninguna figura seleccionada");
		} else {
			int x = this.finish.x - this.init.x;
			int y = this.finish.y - this.init.y;
			this.selected.move(x, y);
		}
	}

}
