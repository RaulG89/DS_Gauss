package model;

import org.joda.time.LocalDateTime;

import validators.Validator;
import validators.date.ValidatorAfterToday;
import validators.number.ValidatorMinMax;
import validators.number.ValidatorTwoValue;

public class BloodAnalysis {
	public final static double MIN_HIGH = 8;
	public final static double MAX_HIGH = 20;
	public final static double MIN_LOW = 5;
	public final static double MAX_LOW = 11;

	private double high;
	private double low;
	private double sugar;
	private LocalDateTime date;
	private Person person;

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		Validator validator = new ValidatorMinMax(MIN_HIGH, MAX_HIGH, high);
		if (low > 0) {
			validator = new ValidatorTwoValue(high, low);
		}
		validator.valid();
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		Validator validator = new ValidatorMinMax(MIN_LOW, MAX_LOW, low);
		if (high > 0) {
			validator = new ValidatorTwoValue(high, low);
		}
		validator.valid();
		this.low = low;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		new ValidatorMinMax(25, 500, sugar).valid();
		this.sugar = sugar;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		new ValidatorAfterToday(date).valid();
		this.date = date;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "BloodAnalysis [high=" + high + ", low=" + low + ", sugar="
				+ sugar + ", date=" + date + ", person=" + person + "]";
	}

}
