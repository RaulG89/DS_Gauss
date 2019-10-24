package form;

import form.strategy.FormStrategy;
import form.strategy.FormMonument;
import form.strategy.FormPhoto;
import form.strategy.FormRestaurant;
import google.maps.Coordinates;
import model.Monument;
import model.Photo;
import model.Restaurant;

public class FormApp {
	public static void main(String[] args) {
		Monument coliseo = new Monument("Coliseo", "Vespasiano",
				"Piazza del Colosseo, 1, 00184 Roma, Italia");
		Photo photoColosseum = new Photo(
				"Colosseum in Rome, Italy - April 2007", "DAVID ILIFF",
				new Coordinates(20, 20));
		Restaurant tavernaDeiFori = new Restaurant(
				"La Taverna dei Fori Imperiali",
				"via Madonna dei Monti, 9, 00184 Roma, Italia",
				"+39 06 6798643");

		FormStrategy form = new FormMonument(coliseo);
		form.edit();

		// Tarea 1. Editar también el restaurante: que se puedan editar el
		// nombre y la dirección
		System.err.println("\n************************\n");
		form = new FormRestaurant(tavernaDeiFori);
		form.edit();

		// Tarea 2. Editar también la foto (usuario y descripción)
		System.err.println("\n************************\n");
		form = new FormPhoto(photoColosseum);
		form.edit();
	}

}
