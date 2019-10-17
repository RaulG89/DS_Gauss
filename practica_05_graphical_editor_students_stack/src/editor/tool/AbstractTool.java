package editor.tool;

import editor.Editor;
import editor.History;
import editor.changes.Change;
import editor.changes.CreationChange;
import editor.changes.SelectionChange;
import figures.Figure;

public abstract class AbstractTool implements Tool {
	protected Editor editor;

	public AbstractTool(Editor editor) {
		this.editor = editor;
	}

	protected void saveChange(Figure figure) {
		Change change = new CreationChange(figure, editor.getDrawing());
		History.getInstance().add(change);
	}

	protected void saveChange(Figure figure, int x, int y) {
		Change change = new SelectionChange(figure, x, y);
		History.getInstance().add(change);
	}
}
