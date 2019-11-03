package model;

public class CryptoMoney {
	private String name;
	private double value;
	private double created;

	public CryptoMoney(String name, Double value) {
		this.name = name;
		this.value = value;
		this.created = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void mine(double created) {
		this.created += created;
	}

	public double getCreated() {
		return created;
	}
	
}
