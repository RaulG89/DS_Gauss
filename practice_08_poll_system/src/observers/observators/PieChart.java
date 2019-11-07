package observers.observators;

import observers.Observable;

public class PieChart extends ObservatorAbstract {

	public PieChart(Observable observable) {
		super(observable);
	}

	@Override
	public void update() {
		System.out.println("Dibujando un gráfico circular...");
	}

}
