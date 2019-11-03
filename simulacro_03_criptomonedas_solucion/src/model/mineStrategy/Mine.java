package model.mineStrategy;

import model.CryptoMoney;

public class Mine {
	private CryptoMoney cryptoMoney;
	private double valueGenerate;

	public Mine(CryptoMoney cryptoMoney, double valueGenerate) {
		this.cryptoMoney = cryptoMoney;
		this.valueGenerate = valueGenerate;
	}

	public double generateCoinsPerHour() {
		cryptoMoney.mine(valueGenerate);
		return valueGenerate;
	}

	public double generateCoinsPerDay() {
		return generateCoinsPerHour() * 24;
	}
}
