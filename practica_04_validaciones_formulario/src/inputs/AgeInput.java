package inputs;

import validators.composite.AgeValidator;

public class AgeInput extends AbstractInput {

	public AgeInput() {
		super("Edad");
		this.validator = new AgeValidator();
	}

}
