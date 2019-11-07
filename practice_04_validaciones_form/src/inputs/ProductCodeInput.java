package inputs;

import validators.simple.LengthValidator;

public class ProductCodeInput extends AbstractInput {

	public ProductCodeInput() {
		super("Código de Producto");
		this.validator = new LengthValidator(4);
	}

}
