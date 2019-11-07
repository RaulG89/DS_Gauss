package validators.composite.generic;

import java.util.Arrays;
import java.util.List;

import validators.Validator;

public class AllValidator implements Validator {

	private List<Validator> validations;

	public AllValidator(Validator... validations) {
		this.validations = Arrays.asList(validations);
	}

	public boolean isValid(String texto) {
		for (Validator validacion : validations)
			if (!validacion.isValid(texto))
				return false;
		return true;
	}
}
