package form.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class TemplateForm implements FormStrategy {
	private BufferedReader console;

	public TemplateForm() {
		console = new BufferedReader(new InputStreamReader(System.in));
	}

	protected String readLine() {
		do {
			try {
				return console.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura: inténtelo de nuevo");
			}
		} while (true);
	}

	@Override
	/**
	 * Patrón template
	 */
	public void edit() {
		printHead();

		System.out.println("Valores actuales:");
		print();

		System.out.println("Escriba nuevos valores (dejar en blanco para"
				+ " dejar el valor actual):");
		editValues();
		System.out.println("Valores finales:");
		print();
	}

	protected abstract void printHead();

	protected abstract void editValues();

}