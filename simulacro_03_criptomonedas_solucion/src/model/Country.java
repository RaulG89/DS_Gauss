package model;

public class Country {
	private String name;
	private double priceKwHour;

	public Country(String name, double priceKwHour) {
		super();
		this.name = name;
		this.priceKwHour = priceKwHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPriceKwHour() {
		return priceKwHour;
	}

	public void setPriceKwHour(double priceKwHour) {
		this.priceKwHour = priceKwHour;
	}

}
