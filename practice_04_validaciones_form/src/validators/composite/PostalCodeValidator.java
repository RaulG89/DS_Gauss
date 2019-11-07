package validators.composite;

import validators.composite.generic.AllValidator;
import validators.simple.GreaterValidator;
import validators.simple.NumberValidator;

public class PostalCodeValidator extends AllValidator {

	public PostalCodeValidator() {
		super(new NumberValidator(), new GreaterValidator(18));
	}
}
