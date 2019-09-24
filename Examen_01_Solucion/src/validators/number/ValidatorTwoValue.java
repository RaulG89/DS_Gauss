package validators.number;

import java.util.ArrayList;
import java.util.List;

import model.BloodAnalysis;
import validators.Validator;

public class ValidatorTwoValue implements Validator {
	private double high;
	private double low;
	private Validator composite;

	public ValidatorTwoValue(double high, double low) {
		this.high = high;
		this.low = low;
		composite = new ValidatorComposite(createList());
	}

	private List<Validator> createList() {
		List<Validator> list = new ArrayList<>();
		list.add(new ValidatorMinMax(BloodAnalysis.MIN_HIGH,
				BloodAnalysis.MAX_HIGH, high));
		list.add(new ValidatorMinMax(BloodAnalysis.MIN_LOW,
				BloodAnalysis.MAX_LOW, high));
		return list;
	}

	@Override
	public boolean valid() {
		composite.valid();
		if (low > high) {
			throw new IllegalArgumentException(
					"El valor mínimo es mayor que el valor máximo");
		}
		return true;
	}

}
