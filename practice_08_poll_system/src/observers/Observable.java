package observers;

public interface Observable {
	void notifyObservators();

	int getYeses();

	int getNos();
}
