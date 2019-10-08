package validators;

public class ValidatorCodePost implements Validator {
	private Validator validator;

	public ValidatorCodePost() {
		this.validator = new ValidatorLength(5);
	}

	@Override
	public boolean isValid(String value) {
		if (this.validator.isValid(value)) {
			return new ValidatorNumber().isValid(value);
		}
		return false;
	}

}
