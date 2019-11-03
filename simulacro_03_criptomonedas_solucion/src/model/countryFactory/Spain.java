package model;

import model.cryptoMoney.Btc;
import model.cryptoMoney.Eth;
import model.cryptoMoney.Xlm;
import model.mineStrategy.Mine;

public class Spain extends Country {

	public Spain() {
		super("España", 12.17);
		this.btcMine = new Mine(new Btc(), 20);
		this.ethMine = new Mine(new Eth(), 2);
		this.xmlMine = new Mine(new Xlm(), 30);
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
