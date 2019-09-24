package validators.date;

import org.joda.time.LocalDateTime;

public class ValidatorDateNull extends ValidatorDate {
	public ValidatorDateNull(LocalDateTime date) {
		super(date);
	}

	@Override
	public boolean valid() {
		if (date == null) {
			throw new IllegalArgumentException("Fecha nula");
		}
		return true;
	}
}
