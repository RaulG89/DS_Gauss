package editor;

import java.util.Stack;

import editor.changes.Change;

public class History {
	private static History history;
	private Stack<Change> undos;
	private Stack<Change> redos;

	public History() {
		this.undos = new Stack<>();
		this.redos = new Stack<>();
	}

	public static History getInstance() {
		if (history == null) {
			history = new History();
		}
		return history;
	}

	public void add(Change change) {
		redos.clear();
		undos.add(change);
	}

	public void undo() {
		if (undos.isEmpty()) {
			System.out.println("No hay cambios registrados para desahacer");
		} else {
			Change change = undos.pop();
			change.undo();
			redos.push(change);
		}
	}

	public void redo() {
		if (redos.isEmpty()) {
			System.out.println("No hay cambios registrados para rehacer");
		} else {
			Change change = redos.pop();
			change.redo();
			undos.push(change);
		}
	}
}
