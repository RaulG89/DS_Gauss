package validators.number;

import validators.Validator;

public abstract class ValidatorsNumber implements Validator {
	protected double value;

	public ValidatorsNumber(double value) {
		this.value = value;
	}
}
