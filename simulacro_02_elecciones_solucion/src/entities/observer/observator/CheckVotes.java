package entities.observer.observator;

import java.util.List;

import entities.PoliticGroup;
import entities.observer.Voting;

public class CheckVotes extends AbstractObservator {

	private List<PoliticGroup> politicGroups;

	public CheckVotes(Voting voting, List<PoliticGroup> politicGroups) {
		super(voting);
		this.politicGroups = politicGroups;
	}

	@Override
	public void update() {
		for (PoliticGroup group : politicGroups) {
			System.out.println(group);
		}
		System.out.println("\n****************************\n");
	}

}
