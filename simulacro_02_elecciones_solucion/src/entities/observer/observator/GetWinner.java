package entities.observer.observator;

import java.util.List;

import entities.PoliticGroup;

public class GetWinner implements Observator {

	private List<PoliticGroup> politicGroups;

	public GetWinner(List<PoliticGroup> politicGroups) {
		this.politicGroups = politicGroups;
	}

	@Override
	public void update() {
		PoliticGroup winner = new PoliticGroup("");
		for (PoliticGroup group : politicGroups) {
			if (group.getNumVotes() > winner.getNumVotes()) {
				winner = group;
			}
		}
		System.out.println("El ganador es: " + winner);
	}

}
