package inputs;

import validators.composite.PostalCodeValidator;

public class PostCodeInput extends AbstractInput {

	public PostCodeInput() {
		super("Código Postal");
		this.validator = new PostalCodeValidator();
	}

}
