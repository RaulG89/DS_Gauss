package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entities.PoliticGroup;
import entities.Vote;

public class GenerateRandomVotes implements Generator<List<Vote>> {
	private List<PoliticGroup> politicGroups;
	private int numVotes;

	public GenerateRandomVotes(List<PoliticGroup> politicGroups, int numvotes) {
		this.politicGroups = politicGroups;
		this.numVotes = numvotes;
	}

	@Override
	public List<Vote> generate() {
		List<Vote> votes = new ArrayList<Vote>();
		for (int i = 0; i < numVotes; i++) {
			Random random = new Random();
			int position = random.nextInt(politicGroups.size());
			votes.add(new Vote(politicGroups.get(position)));
		}
		return votes;
	}

}
