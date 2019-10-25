package google.maps.elements;

import google.maps.Coordinates;
import model.Photo;

public class MapPhoto implements MapElement {
	private Photo photo;

	public MapPhoto(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String getTitle() {
		return this.photo.getDescription();
	}

	@Override
	public Coordinates getCoordinates() {
		return this.photo.getCoordinates();
	}

	@Override
	public String getHTMLInfo() {
		return this.photo.getDescription() + " - " + this.photo.getUser();
	}

	@Override
	public void open() {
		this.photo.show();
	}

}
