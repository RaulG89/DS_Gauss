package validators.bloodAnalysis;

import model.BloodAnalysis;
import validators.Validator;

public abstract class ValidatorBloodAnalysis implements Validator {
	protected BloodAnalysis analysis;

	public ValidatorBloodAnalysis(BloodAnalysis analysis) {
		super();
		this.analysis = analysis;
	}
}
