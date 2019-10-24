package form.strategy;

import model.Monument;

/* 
 * Formulario básico para usar cuando se quieran pedir sólo dos valores sobre algo.
 */
public class FormMonument extends TemplateForm {

	private Monument monument;

	public FormMonument(Monument monument) {
		this.monument = monument;
	}

	@Override
	protected void printHead() {
		System.out.println("Editando el monumento...");
	}

	@Override
	public void editValues() {
		setAuthor();
		setAddress();
	}

	private void setAuthor() {
		System.out.print(" - Autor: ");
		String value = readLine();
		if (value.length() > 0)
			monument.setAuthor(value);
	}

	private void setAddress() {
		String value;
		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			monument.setAddress(value);
	}

	@Override
	public void print() {
		System.out.println(" - Autor: " + monument.getAuthor());
		System.out.println(" - Dirección: " + monument.getAddress());
	}

}
