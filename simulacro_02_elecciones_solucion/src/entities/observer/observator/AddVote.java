package entities.observer.observator;

import entities.PoliticGroup;
import entities.Vote;
import entities.observer.Voting;

public class AddVote extends AbstractObservator {

	public AddVote(Voting voting) {
		super(voting);
	}

	@Override
	public void update() {
		int last = voting.getVotes().size() - 1;
		Vote vote = voting.getVotes().get(last);
		PoliticGroup politicGroup = vote.getPoliticGroup();
		politicGroup.setNumVotes(politicGroup.getNumVotes() + 1);
	}

}
