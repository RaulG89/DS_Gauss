package inputs.generic;
import inputs.AbstractInput;
import validators.simple.TextValidator;

public class TextInput extends AbstractInput {

	public TextInput(String etiqueta) {
		super(etiqueta);
		this.validator = new TextValidator();
	}

}
