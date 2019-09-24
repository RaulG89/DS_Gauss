package validators.number;

public class ValidatorMinMax extends ValidatorsNumber {
	private double max;
	private ValidatorMin validatorMin;

	public ValidatorMinMax(double min, double max, double value) {
		super(value);
		this.validatorMin = new ValidatorMin(min, value);
		this.max = max;
	}

	@Override
	public boolean valid() {
		if (value > max) {
			throw new IllegalArgumentException("Valor superior no válido");
		}
		return this.validatorMin.valid();
	}
}