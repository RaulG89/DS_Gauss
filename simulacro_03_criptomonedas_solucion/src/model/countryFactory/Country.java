package model.countryFactory;

import model.mineStrategy.Mine;

public abstract class Country implements MineCountry {
	private String name;
	private double priceKwHour;

	protected Mine btcMine;
	protected Mine ethMine;
	protected Mine xmlMine;

	public Country(String name, double priceKwHour) {
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

	@Override
	public double mineBitCoinPerDay() {
		return this.btcMine.generateCoinsPerDay();
	}

	@Override
	public double mineEtheriumPerDay() {
		return this.ethMine.generateCoinsPerDay();
	}

	@Override
	public double mineXlmPerDay() {
		return this.xmlMine.generateCoinsPerDay();
	}
}
