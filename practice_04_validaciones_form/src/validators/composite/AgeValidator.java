package validators.composite;

import validators.composite.generic.AllValidator;
import validators.simple.GreaterValidator;
import validators.simple.NumberValidator;

public class AgeValidator extends AllValidator {

	public AgeValidator() {
		super(new NumberValidator(), new GreaterValidator(18));
	}
}
