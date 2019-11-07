package validators.composite;

import validators.composite.generic.AllValidator;
import validators.simple.GreaterValidator;
import validators.simple.LessValidator;
import validators.simple.NumberValidator;

public class SalaryValidator extends AllValidator {

	public SalaryValidator() {
		super(new NumberValidator(), new GreaterValidator(800),
				new LessValidator(1200));
	}
}
