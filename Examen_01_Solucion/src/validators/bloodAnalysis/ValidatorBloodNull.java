package validators.bloodAnalysis;

import model.BloodAnalysis;

public class ValidatorBloodNull extends ValidatorBloodAnalysis {

	public ValidatorBloodNull(BloodAnalysis analysis) {
		super(analysis);
	}

	@Override
	public boolean valid() {
		if (analysis == null) {
			throw new IllegalArgumentException("El analisis es nulo");
		}
		return true;
	}

}
