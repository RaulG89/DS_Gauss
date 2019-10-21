package entities.observer.observator;

import entities.observer.Voting;

public abstract class AbstractObservator implements Observator {

	protected Voting voting;

	public AbstractObservator(Voting voting) {
		this.voting = voting;
	}
}
