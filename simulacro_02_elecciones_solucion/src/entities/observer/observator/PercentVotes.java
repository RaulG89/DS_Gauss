package entities.observer.observator;

import java.util.List;

import entities.PoliticGroup;
import entities.observer.Voting;

public class PercentVotes extends AbstractObservator {

	private List<PoliticGroup> politicGroups;

	public PercentVotes(Voting voting, List<PoliticGroup> politicGroups) {
		super(voting);
		this.politicGroups = politicGroups;
	}

	@Override
	public void update() {
		System.out.println("Porcentajes de votos:");
		for (PoliticGroup politicGroup : politicGroups) {
			double percent = ((double) politicGroup.getNumVotes()
					/ (double) voting.getVotes().size()) * 100;
			System.out.println(politicGroup.getName() + ": " + percent + "%");
		}
	}

}
