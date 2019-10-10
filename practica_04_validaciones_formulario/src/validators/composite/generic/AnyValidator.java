package validators.composite.generic;

import java.util.Arrays;
import java.util.List;

import validators.Validator;

public class AnyValidator implements Validator {

	private List<Validator> validations;

	public AnyValidator(Validator... validations) {
		this.validations = Arrays.asList(validations);
	}

	public boolean isValid(String texto) {
		for (Validator validacion : validations)
			if (validacion.isValid(texto))
				return true;
		return false;
	}
}
