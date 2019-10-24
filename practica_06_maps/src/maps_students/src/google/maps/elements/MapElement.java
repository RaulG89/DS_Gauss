package google.maps.elements;

import google.maps.Coordinates;

public interface MapElement {
	String getTitle();

	Coordinates getCoordinates();

	String getHTMLInfo();

	void open();
}
