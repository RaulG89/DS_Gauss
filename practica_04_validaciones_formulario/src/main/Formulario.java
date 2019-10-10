package main;
import java.util.*;

import inputs.Input;

public class Formulario {
	public void addCampo(Input campo) {
		campos.add(campo);
	}

	public void PideDatos() {
		for (Input campo : campos) {
			campo.pideDato();
			System.out.println(campo.getDato());
		}
	}

	private List<Input> campos = new ArrayList<Input>();
}
