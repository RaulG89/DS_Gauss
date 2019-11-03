package model.countryFactory;

import model.cryptoMoney.Btc;
import model.cryptoMoney.Eth;
import model.cryptoMoney.Xlm;
import model.mineStrategy.Mine;

public class China extends Country {

	public China() {
		super("China", 4);
		this.btcMine = new Mine(new Btc(), 10);
		this.ethMine = new Mine(new Eth(), 200);
		this.xmlMine = new Mine(new Xlm(), 300);
	}

}
