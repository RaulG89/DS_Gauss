package inputs;

import validators.composite.SalaryValidator;

public class SalaryInput extends AbstractInput {

	public SalaryInput() {
		super("Sueldo");
		this.validator = new SalaryValidator();
	}

}
