package observers.observators;

import observers.Observable;
import observers.Observator;

public abstract class ObservatorAbstract implements Observator {
	protected Observable observable;

	public ObservatorAbstract(Observable observable) {
		this.observable = observable;
	};
}
