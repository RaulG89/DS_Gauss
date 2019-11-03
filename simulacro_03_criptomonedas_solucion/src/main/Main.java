package main;

import model.CryptoMoney;
import model.countryFactory.China;
import model.countryFactory.Country;
import model.countryFactory.Spain;
import model.countryFactory.Venezuela;
import model.cryptoMoney.Btc;
import model.cryptoMoney.Eth;
import model.cryptoMoney.Xlm;

/**
 * Simplifica el código para poder añadir en el futuro más criptomonedas y
 * paises
 */
public class Main {

	private static Country spain;
	private static Country china;
	private static Country venezuela;

	public static void main(String[] args) {

		spain = new Spain();
		china = new China();
		venezuela = new Venezuela();

		mine(new Btc());
		mine(new Eth());
		mine(new Xlm());
	}

	private static void mine(CryptoMoney money) {
		System.out.println("***********************************************");
		System.out.println("La criptomoneda " + money.getName() + " vale "
				+ money.getValue() + " €");
		double generateSpainDay = generateCoinsPerday(spain, money);
		System.out.println("En un día España genera " + generateSpainDay
				+ " de " + money.getName());
		double generateChineseDay = generateCoinsPerday(china, money);
		System.out.println("En un día China genera " + generateChineseDay
				+ " de " + money.getName());
		double generateVenezuelaDay = generateCoinsPerday(venezuela, money);
		System.out.println("En un día Venezuela genera " + generateVenezuelaDay
				+ " de " + money.getName());

		calculateBenefits(money, generateSpainDay, generateChineseDay,
				generateVenezuelaDay);
	}

	private static void calculateBenefits(CryptoMoney money,
			double generateSpainDay, double generateChineseDay,
			double generateVenezuelaDay) {
		double costSpain = generateSpainDay * spain.getPriceKwHour();
		double costChinese = generateChineseDay * china.getPriceKwHour();
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
			System.out.println(china.getName() + " con un beneficio de "
					+ benefitsChinese + " € al dia");
		} else if (benefitsVenezuela > benefitsChinese
				&& benefitsVenezuela > benefitsSpain) {
			System.out.println(venezuela.getName() + " con un beneficio de "
					+ benefitsVenezuela + " € al dia");
		} else {
			System.out.println(" ninguno. Mejor vete a dormir anda");
		}
	}

	private static double generateCoinsPerday(Country country,
			CryptoMoney cryptoMoney) {
		double numCrypto = 0;
		switch (cryptoMoney.getName()) {
		case "Bitcoin":
			numCrypto = country.mineBitCoinPerDay();
			break;
		case "Ethereum":
			numCrypto = country.mineEtheriumPerDay();
			break;
		case "Stellar Lumens":
			numCrypto = country.mineXlmPerDay();
			break;
		}
		return numCrypto;
	}

}
