package editor;

import editor.tool.Tool;

public class Editor {
	private Drawing drawing; // el documento de dibujo
	private Tool tool;

	public Editor() {
		this.drawing = new Drawing();
	}

	public Drawing getDrawing() {
		return drawing;
	}

	public void setDrawing(Drawing drawing) {
		this.drawing = drawing;
	}

	public void drawDocument() {
		drawing.draw();
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public void redo() {
		History.getInstance().redo();
	}

	public void undo() {
		History.getInstance().undo();
	}
}
