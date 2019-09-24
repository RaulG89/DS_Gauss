package validators.number;

public class ValidatorZero extends ValidatorsNumber {
	private ValidatorMin validatorMin;

	public ValidatorZero(double value) {
		super(value);
		validatorMin = new ValidatorMin(0, value);
	}

	@Override
	public boolean valid() {
		return validatorMin.valid();
	}

}
