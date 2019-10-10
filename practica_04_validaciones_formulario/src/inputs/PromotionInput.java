package inputs;

import validators.composite.PromotionValidator;

public class PromotionInput extends AbstractInput {

	public PromotionInput() {
		super("Promoción");
		this.validator = new PromotionValidator();
	}

}
