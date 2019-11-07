package editor.changes;

import figures.Figure;

public class SelectionChange implements Change {

	private Figure figure;
	private int x;
	private int y;

	public SelectionChange(Figure figure, int x, int y) {
		this.figure = figure;
		this.x = x;
		this.y = y;
	}

	@Override
	public void undo() {
		figure.move(-x, -y);
		System.out.println("Mueve la figura " + figure + " a " + -x + ", "+ -y);
	}

	@Override
	public void redo() {
		figure.move(x, y);
		System.out.println("Mueve la figura " + figure + " a " + x + ", "+ y);
	}

}
