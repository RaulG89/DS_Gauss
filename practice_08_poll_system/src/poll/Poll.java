package poll;

import java.util.ArrayList;
import java.util.List;

import observers.Observable;
import observers.Observator;

public class Poll implements Observable {
	private int yeses;
	private int nos;
	private String question;
	private List<Observator> observators;

	public Poll(String question) {
		this.question = question;
		this.observators = new ArrayList<>();
	}

	public String getQuestion() {
		return question;
	}

	public int getYeses() {
		return yeses;
	}

	public int getNos() {
		return nos;
	}

	public List<Observator> getObservators() {
		return observators;
	}

	public void setObservators(List<Observator> observators) {
		this.observators = observators;
	}

	public void incrementYeses() {
		yeses++;
		notifyObservators();
	}

	public void incrementNos() {
		nos++;
		notifyObservators();
	}

	@Override
	public void notifyObservators() {
		for (Observator observator : observators) {
			observator.update();
		}
	}
}
