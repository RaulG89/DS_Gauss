package validators;

public class ValidatorPredefined implements Validator {

	private String[] valores;

	public ValidatorPredefined(String[] valores) {
		this.valores = valores;
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
