package validators.number;

public class ValidatorMax extends ValidatorsNumber {
	private double max;

	public ValidatorMax(double min, double max, double value) {
		super(value);
		this.max = max;
	}

	@Override
	public boolean valid() {
		if (value > max) {
			throw new IllegalArgumentException("Valor superior no válido");
		}
		return true;
	}
}