package validators.number;

public class ValidatorMin extends ValidatorsNumber {
	protected double min;

	public ValidatorMin(double min, double value) {
		super(value);
		this.min = min;
	}

	@Override
	public boolean valid() {
		if (min > value) {
			throw new IllegalArgumentException("Valor nulo o cero");
		}
		return true;
	}

}
