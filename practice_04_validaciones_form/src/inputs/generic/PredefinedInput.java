package inputs.generic;
import inputs.AbstractInput;
import validators.simple.PredefinedValidator;

public class PredefinedInput extends AbstractInput {

	public PredefinedInput(String etiqueta, String... valores) {
		super(etiqueta);
		this.validator = new PredefinedValidator(valores);
	}

}
