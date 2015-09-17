package de.maertinszone.examples.generics.override;

import static org.junit.Assert.*;

import org.junit.Test;

public class OverrideTest {

	@Test
	public void test() {
		assertEquals("My food is Cheese", new OMouse().tellFoodClass());
		assertEquals("My food is Fish", new OCat().tellFoodClass());
		assertEquals("My food is Fish", new OKitten().tellFoodClass());
	}

}
