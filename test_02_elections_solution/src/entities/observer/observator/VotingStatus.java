package entities.observer.observator;

import java.util.List;

import entities.Vote;
import entities.observer.Voting;

public class VotingStatus implements Observator {

	private List<Vote> votes;
	private Voting voting;

	public VotingStatus(Voting voting, List<Vote> votes) {
		this.voting = voting;
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
