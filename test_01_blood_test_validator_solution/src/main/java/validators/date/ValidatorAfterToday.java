package validators.date;

import org.joda.time.LocalDateTime;

public class ValidatorAfterToday extends ValidatorDate {
	private ValidatorDateNull validator;

	public ValidatorAfterToday(LocalDateTime date) {
		super(date);
		validator = new ValidatorDateNull(date);
	}

	@Override
	public boolean valid() {
		this.validator.valid();
		if (date.isAfter(new LocalDateTime())) {
			throw new IllegalArgumentException("Fecha nula");
		}
		return true;
	}

}
