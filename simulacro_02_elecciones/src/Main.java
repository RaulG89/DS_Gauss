import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * Simplifica el código para que cuente el número total de votos en tiempo real
 * 
 * 
 * @author Iván González Mahagamage
 *
 */
public class Main {
	private static PoliticGroup pp;
	private static PoliticGroup vox;
	private static PoliticGroup ciudadanos;
	private static PoliticGroup psoe;
	private static PoliticGroup podemos;
	private static PoliticGroup masPais;
	private static List<PoliticGroup> politicGroups;
	private static List<Vote> votes;

	public static void main(String[] args) {
		politicGroups = new ArrayList<>();
		pp = new PoliticGroup("PP");
		politicGroups.add(pp);
		vox = new PoliticGroup("VOX");
		politicGroups.add(vox);
		ciudadanos = new PoliticGroup("Ciudadanos");
		politicGroups.add(ciudadanos);
		psoe = new PoliticGroup("PSOE");
		politicGroups.add(psoe);
		podemos = new PoliticGroup("Podemos");
		politicGroups.add(podemos);
		masPais = new PoliticGroup("MasPais");
		politicGroups.add(masPais);

		votes = new ArrayList<>();
		int numVotes = 40;

		for (int i = 0; i < numVotes; i++) {
			Random random = new Random();
			int position = random.nextInt(politicGroups.size());
			votes.add(new Vote(politicGroups.get(position)));
		}

		for (int i = 0; i < numVotes; i++) {
			PoliticGroup politicGroup = votes.get(i).getPoliticGroup();
			politicGroup.setNumVotes(politicGroup.getNumVotes() + 1);
			System.out.println("Escrutiño actual:");
			System.out.println("Número de votos revisados: " + (i + 1));
			for (PoliticGroup group : politicGroups) {
				System.out.println(group);
			}
			System.out.println("\n****************************\n");
		}

		PoliticGroup winner = new PoliticGroup("");
		for (PoliticGroup group : politicGroups) {
			if (group.getNumVotes() > winner.getNumVotes()) {
				winner = group;
			}
		}
		System.out.println("El ganador es: " + winner);
	}

}
