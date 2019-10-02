package editor.tool;

import editor.Editor;

public abstract class AbstractTool implements Tool {
	protected Editor editor;

	public AbstractTool(Editor editor) {
		this.editor = editor;
	}
}
