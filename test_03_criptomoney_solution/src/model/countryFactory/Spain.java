package model.countryFactory;

import model.mineStrategy.Mine;

public class Spain extends Country {

	public Spain() {
		super("España", 12.17);
		this.btcMine = new Mine(20);
		this.ethMine = new Mine(2);
		this.xmlMine = new Mine(30);
	}

}
