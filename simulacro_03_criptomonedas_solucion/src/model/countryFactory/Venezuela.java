package model.countryFactory;

import model.mineStrategy.Mine;

public class Venezuela extends Country {

	public Venezuela() {
		super("Venezuela", 0.016);
		this.btcMine = new Mine(5);
		this.ethMine = new Mine(20);
		this.xmlMine = new Mine(30);
	}

}
