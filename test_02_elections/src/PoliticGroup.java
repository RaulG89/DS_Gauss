
public class PoliticGroup {
	private String name;
	private int numVotes;

	public PoliticGroup(String name) {
		this.name = name;
		this.numVotes = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}

	@Override
	public String toString() {
		return "PoliticGroup [name=" + name + ", numVotes=" + numVotes + "]";
	}

}
