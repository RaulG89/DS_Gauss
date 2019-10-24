package form.strategy;

import google.maps.Coordinates;
import model.Photo;

public class FormPhoto extends TemplateForm {

	private Photo photo;

	public FormPhoto(Photo photo) {
		this.photo = photo;
	}
	
	@Override
	protected void printHead() {
		System.out.println("Editando la fotográfia...");
	}

	@Override
	public void editValues() {
		setUsuario();
		setDescription();
		setCoordinates();
	}

	private void setUsuario() {
		System.out.print(" - Usuario: ");
		String value = readLine();
		if (value.length() > 0)
			photo.setUser(value);
	}

	private void setDescription() {
		String value;
		System.out.print(" - Descripción: ");
		value = readLine();
		if (value.length() > 0)
			photo.setDescription(value);
	}

	private void setCoordinates() {
		String value;
		double longitude = 0;
		double latitude = 0;
		try {
			System.out.print(" - Coordenadas: longitud ");
			value = readLine();
			if (value.length() > 0) {
				longitude = Double.parseDouble(value);
			}

			System.out.print(" - Coordenadas: latitud ");
			value = readLine();
			if (value.length() > 0) {
				latitude = Double.parseDouble(value);
			}

			photo.setCoordinates(new Coordinates(longitude, latitude));
		} catch (NumberFormatException e) {
			System.err.println("Número no válido");
		}
	}

	@Override
	public void print() {
		System.out.println(" - Usuario: " + photo.getUser());
		System.out.println(" - Descripción: " + photo.getDescription());
		System.out.println(" - Coordenadas: " + photo.getCoordinates());
	}
}
