package editor.changes;

import editor.Drawing;
import figures.Figure;

public class CreationChange implements Change {
	private Figure figure;
	private Drawing drawing;

	public CreationChange(Figure figure, Drawing drawing) {
		this.figure = figure;
		this.drawing = drawing;
	}

	public void undo() {
		drawing.remove(figure);
		System.out.println("Elimina la figura: " + figure);
	}

	public void redo() {
		drawing.add(figure);
		System.out.println("Añade la figura: " + figure);
	}
}
