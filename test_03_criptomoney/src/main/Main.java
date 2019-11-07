package main;

import model.Country;
import model.CryptoMoney;

/**
 * Simplifica el código para poder añadir en el futuro más criptomonedas y
 * paises
 */
public class Main {

	private static CryptoMoney btc;
	private static CryptoMoney eth;
	private static CryptoMoney xlm;
	private static Country spain;
	private static Country chinese;
	private static Country venezuela;

	public static void main(String[] args) {
		btc = new CryptoMoney("Bitcoin", 8734.11);
		eth = new CryptoMoney("Ethereum", 167.65);
		xlm = new CryptoMoney("Stellar Lumens", 0.0585);

		spain = new Country("España", 12.17);
		chinese = new Country("China", 4);
		venezuela = new Country("Venezuela", 0.016);

		mine(btc);
		mine(eth);
		mine(xlm);
	}

	private static void mine(CryptoMoney money) {
		System.out.println("***********************************************");
		System.out.println("La criptomoneda " + money.getName() + " vale "
				+ money.getValue() + " €");
		double generateSpainDay = generateCoinsPerHour(money, spain);
		System.out.println("En un día España genera " + generateSpainDay
				+ " de " + money.getName());
		double generateChineseDay = generateCoinsPerHour(money, chinese);
		System.out.println("En un día China genera " + generateChineseDay
				+ " de " + money.getName());
		double generateVenezuelaDay = generateCoinsPerHour(money, venezuela);
		System.out.println("En un día Venezuela genera " + generateVenezuelaDay
				+ " de " + money.getName());

		double costSpain = generateSpainDay * spain.getPriceKwHour();
		double costChinese = generateChineseDay * chinese.getPriceKwHour();
		double costVenezuela = generateVenezuelaDay
				* venezuela.getPriceKwHour();

		double moneySpain = generateSpainDay * money.getValue();
		double moneyChinese = generateChineseDay * money.getValue();
		double moneyVenezuela = generateVenezuelaDay * money.getValue();

		double benefitsSpain = moneySpain - costSpain;
		double benefitsChinese = moneyChinese - costChinese;
		double benefitsVenezuela = moneyVenezuela - costVenezuela;

		System.out.print("Es más rentable minar " + money.getName() + " en ");
		if (benefitsSpain > benefitsChinese
				&& benefitsSpain > benefitsVenezuela) {
			System.out.println(spain.getName() + " con un beneficio de "
					+ benefitsSpain + " € al dia");
		} else if (benefitsChinese > benefitsSpain
				&& benefitsChinese > benefitsVenezuela) {
			System.out.println(chinese.getName() + " con un beneficio de "
					+ benefitsChinese + " € al dia");
		} else if (benefitsVenezuela > benefitsChinese
				&& benefitsVenezuela > benefitsSpain) {
			System.out.println(venezuela.getName() + " con un beneficio de "
					+ benefitsVenezuela + " € al dia");
		} else {
			System.out.println(" ninguno. Mejor vete a dormir anda");
		}
	}

	private static double generateCoinsPerHour(CryptoMoney cryptoMoney,
			Country country) {
		double crypo = 0;
		switch (country.getName()) {
		case "España":
			crypo = generateCoinsPerHour(cryptoMoney, 20, 2, 30);
			break;
		case "China":
			crypo = generateCoinsPerHour(cryptoMoney, 10, 200, 300);
			break;
		case "Venezuela":
			crypo = generateCoinsPerHour(cryptoMoney, 5, 20, 30);
			break;
		}
		return crypo * 24;
	}

	private static double generateCoinsPerHour(CryptoMoney btcMoney,
			double... values) {
		double numCrypto = 0;
		switch (btcMoney.getName()) {
		case "Bitcoin":
			numCrypto = values[0];
			break;
		case "Ethereum":
			numCrypto = values[1];
			break;
		case "Stellar Lumens":
			numCrypto = values[2];
			break;
		}
		return numCrypto;
	}

}
