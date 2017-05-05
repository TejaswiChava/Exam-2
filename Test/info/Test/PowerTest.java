package info.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import info.exam.Power;

public class PowerTest {
	Power power;

	@Before
	public void setUp() throws Exception {
		power = new Power();
	}

	@Test
	public void milliontest() {
		String result = power.input(6);
		assertEquals("million", result);

	}

	@Test
	public void billiontest() {
		String result = power.input(9);
		assertEquals("Billion", result);

	}

	@Test
	public void trilliontest() {
		String result = power.input(12);
		assertEquals("Trillion", result);

	}

	@Test
	public void quadrilliontest() {
		String result = power.input(15);
		assertEquals("quadrillion", result);

	}

	@Test
	public void quintilliontest() {
		String result = power.input(18);
		assertEquals("Quintillion", result);

	}

	@Test
	public void sextilliontest() {
		String result = power.input(21);
		assertEquals("Sextillion", result);

	}

	@Test
	public void nontilliontet() {
		String result = power.input(30);
		assertEquals("Nontillion", result);

	}

	@Test
	public void googoltest() {
		String result = power.input(100);
		assertEquals("Googol", result);

	}

	@Test
	public void nowordtest() {
		String result = power.input(23);
		assertEquals("", result);

	}

}
