package validators.simple;

import validators.Validator;

public class LengthValidator implements Validator {
	private int length;

	public LengthValidator(int length) {
		this.length = length;
	}

	@Override
	public boolean isValid(String value) {
		return value.length() == length;
	}

}
