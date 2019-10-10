package validators.composite;

import validators.composite.generic.AnyValidator;
import validators.simple.PredefinedValidator;

public class LocationValidator extends AnyValidator {
	public LocationValidator(String... values) {
		super(new PredefinedValidator(values), new PostalCodeValidator());
	}
}
