package com.gauss;
import org.joda.time.LocalDateTime;

public class BloodAnalysis {
	private float high;
	private float low;
	private float sugar;
	private LocalDateTime date;
	private Person person;

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getLow() {
		return low;
	}

	public void setLow(float low) {
		this.low = low;
	}

	public float getSugar() {
		return sugar;
	}

	public void setSugar(float sugar) {
		this.sugar = sugar;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
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
