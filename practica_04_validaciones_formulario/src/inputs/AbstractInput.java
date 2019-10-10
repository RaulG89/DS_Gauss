package inputs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import validators.Validator;

public abstract class AbstractInput implements Input {
	private String etiqueta;
	protected String texto;
	protected Validator validator;

	public AbstractInput(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	@Override
	public void pideDato() {
		BufferedReader consola = new BufferedReader(
				new InputStreamReader(System.in));
		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();
				valido = validator.isValid(texto);
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}

	@Override
	public String getDato() {
		return texto;
	}

}
