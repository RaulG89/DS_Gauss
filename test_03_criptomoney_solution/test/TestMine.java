import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.countryFactory.China;
import model.countryFactory.Country;
import model.countryFactory.Spain;
import model.countryFactory.Venezuela;

class TestMine {
	private static Country spain;
	private static Country china;
	private static Country venezuela;

	@BeforeEach
	void init() {
		spain = new Spain();
		china = new China();
		venezuela = new Venezuela();
	}

	@Test
	void testSpainMine() {
		assertEquals(480, spain.mineBitCoinPerDay());
		assertEquals(48, spain.mineEtheriumPerDay());
		assertEquals(720, spain.mineXlmPerDay());
	}

	@Test
	void testChinaMine() {
		assertEquals(240, china.mineBitCoinPerDay());
		assertEquals(4800, china.mineEtheriumPerDay());
		assertEquals(7200, china.mineXlmPerDay());
	}

	@Test
	void testVenezuelaMine() {
		assertEquals(120, venezuela.mineBitCoinPerDay());
		assertEquals(480, venezuela.mineEtheriumPerDay());
		assertEquals(720, venezuela.mineXlmPerDay());
	}

}
