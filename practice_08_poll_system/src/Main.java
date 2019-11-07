import java.io.*;

import observers.observators.BarChart;
import observers.observators.PieChart;
import observers.observators.SaveResults;
import poll.*;
import ui.Interviewer;

public class Main {
	public static void main(String[] args) throws IOException {
		Poll poll = new Poll("¿Está a favor de la energia nuclear?");
		poll.getObservators().add(new BarChart(poll));
		poll.getObservators().add(new PieChart(poll));
		poll.getObservators().add(new SaveResults(poll));

		Interviewer interviewer = new Interviewer();
		interviewer.fill(poll);
	}
}
