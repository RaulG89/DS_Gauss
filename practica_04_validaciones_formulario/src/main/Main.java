package main;

import inputs.AgeInput;
import inputs.LocationInput;
import inputs.PostCodeInput;
import inputs.ProductCodeInput;
import inputs.PromotionInput;
import inputs.SalaryInput;
import inputs.generic.NumberInput;
import inputs.generic.PredefinedInput;
import inputs.generic.TextInput;

public class Main {
	private static String[] cities = { "Santander", "Oviedo", "Cadiz" };

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new TextInput("Nombre"));
		formulario.addCampo(new TextInput("Apellido"));
		formulario.addCampo(new NumberInput("Teléfono"));
		formulario.addCampo(new PredefinedInput("Ciudad", cities));

		// "Código de Producto". Longitud = 4
		formulario.addCampo(new ProductCodeInput());

		// "Código Postal". Digitos y longitud = 5
		formulario.addCampo(new PostCodeInput());

		// "Edad". Digitos y mayor 18
		formulario.addCampo(new AgeInput());
		// "Sueldo". Digitos y mayor que 800 y menor que 1200
		formulario.addCampo(new SalaryInput());
		// "Ubicación". Santander..Cádiz o código postal
		formulario.addCampo(new LocationInput(cities));
		// "Código de Promoción". Texto o (numero de 3 digitos)
		formulario.addCampo(new PromotionInput());

		formulario.PideDatos();
	}
}
