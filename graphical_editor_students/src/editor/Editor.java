package editor;

import java.util.ArrayList;
import java.util.List;

import editor.tool.Tool;
import editor.tool.create.CreateCircle;

public class Editor {
	private Drawing drawing; // el documento de dibujo
	private List<Tool> tools;

	public Editor() {
		this.drawing = new Drawing();
		this.tools = new ArrayList<Tool>();

		this.tools.add(new CreateCircle(this.drawing));
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
}
