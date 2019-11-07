package validators.bloodAnalysis;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDateTime;

import model.BloodAnalysis;
import validators.Validator;
import validators.date.ValidatorDateNull;
import validators.number.ValidatorComposite;

public class ValidatorAnalysisDate extends ValidatorBloodAnalysis {
	private Validator composite;

	public ValidatorAnalysisDate(BloodAnalysis analysis, LocalDateTime date) {
		super(analysis);
		composite = new ValidatorComposite(createList(date));
	}

	private List<Validator> createList(LocalDateTime date) {
		List<Validator> list = new ArrayList<>();
		list.add(new ValidatorBloodNull(analysis));
		list.add(new ValidatorDateNull(date));
		return list;
	}

	@Override
	public boolean valid() {
		return composite.valid();
	}

}
