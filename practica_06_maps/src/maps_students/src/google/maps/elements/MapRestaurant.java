package google.maps.elements;

import google.maps.Coordinates;
import google.maps.GPS;
import model.Restaurant;

public class MapRestaurant implements MapElement {
	private Restaurant restaurant;
	private GPS gps;

	public MapRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
		this.gps = new GPS();
	}

	@Override
	public String getTitle() {
		return this.restaurant.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return this.gps.getCoordinates(this.restaurant.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		return this.restaurant.getName() + " - " + this.restaurant.getPhone();
	}

	@Override
	public void open() {
		restaurant.call();
	}

}
