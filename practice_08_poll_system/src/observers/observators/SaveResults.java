package observers.observators;

import observers.Observable;

public class SaveResults extends ObservatorAbstract {

	public SaveResults(Observable observable) {
		super(observable);
	}

	@Override
	public void update() {
		System.out.println("Guardando los resultados...");
	}

}
