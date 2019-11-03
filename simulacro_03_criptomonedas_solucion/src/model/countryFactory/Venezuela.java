package model.countryFactory;

import model.cryptoMoney.Btc;
import model.cryptoMoney.Eth;
import model.cryptoMoney.Xlm;
import model.mineStrategy.Mine;

public class Venezuela extends Country {

	public Venezuela() {
		super("Venezuela", 0.016);
		this.btcMine = new Mine(new Btc(), 5);
		this.ethMine = new Mine(new Eth(), 20);
		this.xmlMine = new Mine(new Xlm(), 30);
	}

}
