package validators.simple;

import validators.Validator;

public class GreaterValidator implements Validator {
	private int limit;

	public GreaterValidator(int limit) {
		this.limit = limit;
	}

	@Override
	public boolean isValid(String value) {
		return Integer.parseInt(value) > limit;
	}
}
