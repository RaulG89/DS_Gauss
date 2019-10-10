package validators.composite;

import validators.composite.generic.AllValidator;
import validators.composite.generic.AnyValidator;
import validators.simple.LengthValidator;
import validators.simple.NumberValidator;
import validators.simple.TextValidator;

public class PromotionValidator extends AnyValidator {
	public PromotionValidator() {
		super(new TextValidator(), new AllValidator(new NumberValidator(),
				new LengthValidator(3)));
	}
}
