package model.countryFactory;

import model.mineStrategy.Mine;

public class China extends Country {

	public China() {
		super("China", 4);
		this.btcMine = new Mine(10);
		this.ethMine = new Mine(200);
		this.xmlMine = new Mine(300);
	}

}
