package validators.simple;

import java.util.Arrays;
import java.util.List;

import validators.Validator;

public class PredefinedValidator implements Validator {

	private List<String> valores;

	public PredefinedValidator(String... valores) {
		this.valores = Arrays.asList(valores);
	}

	@Override
	public boolean isValid(String value) {
		for (String valor : valores) {
			if (value.toLowerCase().equals(valor.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
