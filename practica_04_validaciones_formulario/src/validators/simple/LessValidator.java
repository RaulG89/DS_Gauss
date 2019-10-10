package validators.simple;

import validators.Validator;

public class LessValidator implements Validator {
	private int limit;

	public LessValidator(int limit) {
		this.limit = limit;
	}

	@Override
	public boolean isValid(String value) {
		return Integer.parseInt(value) < limit;
	}
}
