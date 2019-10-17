package figures;

public interface Figure {

	public void draw();

	public boolean isSelected(int x, int y);

	public void move(int x, int y);
}
