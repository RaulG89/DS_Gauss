package main;

import java.util.List;

import entities.PoliticGroup;
import entities.Vote;
import entities.observer.Voting;
import entities.observer.observator.AddVote;
import entities.observer.observator.CheckVotes;
import entities.observer.observator.GetWinner;
import entities.observer.observator.PercentVotes;
import entities.observer.observator.VotingStatus;
import util.GeneratePoliticGroup;
import util.GenerateRandomVotes;

/**
 * 
 * Simplifica el código para que cuente el número total de votos en tiempo real
 * 
 * 
 * @author Iván González Mahagamage
 *
 */
public class Main {
	private static int NUM_VOTES = 2000;

	public static void main(String[] args) {
		List<PoliticGroup> politicGroups = new GeneratePoliticGroup()
				.generate();
		List<Vote> votes = new GenerateRandomVotes(politicGroups, NUM_VOTES)
				.generate();

		Voting voting = new Voting();
		voting.add(new AddVote(voting));
		voting.add(new VotingStatus(voting, votes));
		voting.add(new CheckVotes(politicGroups));
		voting.add(new PercentVotes(voting, politicGroups));
		voting.add(new GetWinner(politicGroups));

		for (Vote vote : votes) {
			voting.vote(vote);
		}
	}

}
