package entities.observer.observator;

import java.util.List;

import entities.Vote;
import entities.observer.Voting;

public class VotingStatus extends AbstractObservator {

	private List<Vote> votes;

	public VotingStatus(Voting voting, List<Vote> votes) {
		super(voting);
		this.votes = votes;
	}

	@Override
	public void update() {
		System.out.println("Escrutinio actual:");
		System.out.println(
				"Número de votos revisados: " + voting.getVotes().size());
		int count = votes.size() - voting.getVotes().size();
		System.out.println("Votos restantes: " + count);
	}

}
