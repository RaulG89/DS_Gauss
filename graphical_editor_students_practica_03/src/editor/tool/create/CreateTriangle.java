package editor.tool.create;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import editor.Editor;
import editor.tool.AbstractTool;
import figures.Figure;
import figures.Triangle;

public class CreateTriangle extends AbstractTool {
	private List<Point> points;

	public CreateTriangle(Editor editor) {
		super(editor);
		this.points = new ArrayList<Point>();
		System.out.println(
				"Seleccionada herramienta de creación de " + "triángulos");
	}

	@Override
	public void pulse(int x, int y) {
		this.points.add(new Point(x, y));
		if (points.size() == 3) {
			Figure figure = new Triangle(points.get(0), points.get(1),
					points.get(2));
			this.editor.getDrawing().add(figure);
			this.points = new ArrayList<Point>();
			System.out.println("Creado nuevo triángulo");
		}
	}

	@Override
	public void move(int x, int y) {
		System.out.println("No necesito moverme, acebal cabron");
	}

	@Override
	public void drop() {
		System.out.println("No necesito soltar");
	}

}
