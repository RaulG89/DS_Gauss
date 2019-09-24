package validators.number;

import java.util.List;

import validators.Validator;

/**
 * Patrón Composite
 * 
 * @author Iván González Mahagamage
 *
 */
public class ValidatorComposite implements Validator {
	private List<Validator> validators;

	public ValidatorComposite(List<Validator> validators) {
		this.validators = validators;
	}

	public void add(Validator validator) {
		validators.add(validator);
	}

	@Override
	public boolean valid() {
		for (Validator validators : validators) {
			validators.valid();
		}
		return true;
	}
}
