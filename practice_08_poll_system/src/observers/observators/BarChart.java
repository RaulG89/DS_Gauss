package observers.observators;

import observers.Observable;

public class BarChart extends ObservatorAbstract {

	public BarChart(Observable observable) {
		super(observable);
	}

	@Override
	public void update() {
		System.out.println("Dibujando un gráfico de barras...");
		System.out.println("nº de votos SI = " + observable.getYeses());
		for (int i = 0; i < observable.getYeses(); i++) {
			System.out.print("-");
		}
		System.out.println("\nnº de votos NO = " + observable.getNos());
		for (int i = 0; i < observable.getNos(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
