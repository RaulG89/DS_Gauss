package validators;

public class ValidatorLength implements Validator {
	private int length;

	public ValidatorLength(int length) {
		this.length = length;
	}

	@Override
	public boolean isValid(String value) {
		return value.length() == length;
	}

}
