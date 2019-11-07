
public class Vote {
	private PoliticGroup politicGroup;

	public Vote(PoliticGroup politicGroup) {
		this.politicGroup = politicGroup;
	}

	public PoliticGroup getPoliticGroup() {
		return politicGroup;
	}

	public void setPoliticGroup(PoliticGroup politicGroup) {
		this.politicGroup = politicGroup;
	}

	@Override
	public String toString() {
		return "Vote [politicGroup=" + politicGroup + "]";
	}

}
