package inputs;

import validators.composite.LocationValidator;

public class LocationInput extends AbstractInput {

	public LocationInput(String... etiqueta) {
		super("Ubicación");
		this.validator = new LocationValidator(etiqueta);
	}

}
