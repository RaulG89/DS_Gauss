package form.strategy;

import model.Restaurant;

/* 
 * Formulario básico para usar cuando se quieran pedir sólo dos valores sobre algo.
 */
public class FormRestaurant extends TemplateForm {

	private Restaurant restaurant;

	public FormRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	protected void printHead() {
		System.out.println("Editando el restaurante...");
	}

	@Override
	public void editValues() {
		setName();
		setAddress();
		setPhone();
	}

	private void setPhone() {
		String value;
		System.out.print(" - Teléfono: ");
		value = readLine();
		if (value.length() > 0)
			restaurant.setPhone(value);
	}

	private void setAddress() {
		String value;
		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			restaurant.setAddress(value);
	}

	private void setName() {
		System.out.print(" - Nombre: ");
		String value = readLine();
		if (value.length() > 0)
			restaurant.setName(value);
	}

	@Override
	public void print() {
		System.out.println(" - Nombre: " + restaurant.getName());
		System.out.println(" - Dirección: " + restaurant.getAddress());
		System.out.println(" - Teléfono: " + restaurant.getPhone());
	}
}
