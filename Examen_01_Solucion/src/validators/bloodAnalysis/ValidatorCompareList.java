package validators.bloodAnalysis;

import java.util.List;

import model.BloodAnalysis;
import validators.Validator;

public class ValidatorCompareList extends ValidatorBloodAnalysis {
	private Validator validator;
	private List<BloodAnalysis> list;

	public ValidatorCompareList(BloodAnalysis analysis,
			List<BloodAnalysis> list) {
		super(analysis);
		this.list = list;
		this.validator = new ValidatorBloodNull(analysis);
	}

	@Override
	public boolean valid() {
		this.validator.valid();
		this.list.forEach(analysis -> {
			if (analysis.equals(this.analysis)) {
				throw new IllegalArgumentException(
						"Hay dos analisis con la misma fecha");
			}
		});
		return true;
	}

}
