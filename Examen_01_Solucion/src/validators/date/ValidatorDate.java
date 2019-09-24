package validators.date;

import org.joda.time.LocalDateTime;

import validators.Validator;

public abstract class ValidatorDate implements Validator {
	protected LocalDateTime date;

	public ValidatorDate(LocalDateTime date) {
		this.date = date;
	}
}
