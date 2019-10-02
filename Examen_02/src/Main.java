import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Simplifica el código para que: 
 * - Cuente el número total de votos en tiempo
 * real (puede haber votos en blanco)
 *  - Cada partido politico realizará un
 * mensaje distinto si gana
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
	private static List<PoliticGroup> list;

	public static void main(String[] args) {
		initData();
	}

	private static void initData() {
		list = new ArrayList<PoliticGroup>();
		pp = new PoliticGroup("PP");
		list.add(pp);
		vox = new PoliticGroup("VOX");
		list.add(vox);
		ciudadanos = new PoliticGroup("Ciudadanos");
		list.add(ciudadanos);
		psoe = new PoliticGroup("PSOE");
		list.add(psoe);
		podemos = new PoliticGroup("Podemos");
		list.add(podemos);
		masPais = new PoliticGroup("MasPais");
		list.add(masPais);
	}

//	private static PoliticGroup getWinner() {
//		int maxVotes = 0;
//		PoliticGroup winner = null;
//		for (PoliticGroup group : list) {
//			if (group.getNumVotes() > maxVotes) {
//				winner = group;
//				maxVotes = group.getNumVotes();
//			}
//		}
//		return winner;
//	}

}
