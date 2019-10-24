package google.maps.elements;

import google.maps.Coordinates;
import google.maps.GPS;
import model.Monument;

public class MapMonument implements MapElement {
	private Monument monument;
	private GPS gps;

	public MapMonument(Monument monument) {
		this.monument = monument;
		this.gps = new GPS();
	}

	@Override
	public String getTitle() {
		return this.monument.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return this.gps.getCoordinates(this.monument.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		return this.monument.getName() + " - " + this.monument.getAuthor();
	}

	@Override
	public void open() {
		gps.getDirectionsTo(this.monument.getAddress());
	}

}
