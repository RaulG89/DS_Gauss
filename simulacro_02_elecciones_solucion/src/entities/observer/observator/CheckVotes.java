package entities.observer.observator;

import java.util.List;

import entities.PoliticGroup;

public class CheckVotes implements Observator {

	private List<PoliticGroup> politicGroups;

	public CheckVotes(List<PoliticGroup> politicGroups) {
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
