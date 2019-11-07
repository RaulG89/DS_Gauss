package entities.observer;

import java.util.ArrayList;
import java.util.List;

import entities.Vote;
import entities.observer.observator.Observator;

public class Voting implements Observable {

	private List<Observator> observators;
	private List<Vote> votes;

	public Voting() {
		observators = new ArrayList<Observator>();
		votes = new ArrayList<Vote>();
	}

	public void vote(Vote vote) {
		votes.add(vote);
		notifyOthers();
	}

	@Override
	public void add(Observator observator) {
		observators.add(observator);
	}

	@Override
	public void remove(Observator observator) {
		observators.remove(observator);
	}

	@Override
	public void notifyOthers() {
		for (Observator observator : observators) {
			observator.update();
		}
	}

	public List<Observator> getObservators() {
		return observators;
	}

	public void setObservators(List<Observator> observators) {
		this.observators = observators;
	}

	public List<Vote> getVotes() {
		return votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

}
