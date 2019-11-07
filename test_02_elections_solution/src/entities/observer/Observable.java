package entities.observer;

import entities.observer.observator.Observator;

public interface Observable {
	void add(Observator observator);

	void remove(Observator observator);

	void notifyOthers();
}
