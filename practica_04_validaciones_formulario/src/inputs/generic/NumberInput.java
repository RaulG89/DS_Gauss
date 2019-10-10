package inputs.generic;
import inputs.AbstractInput;
import validators.simple.NumberValidator;

public class NumberInput extends AbstractInput {

	public NumberInput(String etiqueta) {
		super(etiqueta);
		this.validator = new NumberValidator();
	}

}
