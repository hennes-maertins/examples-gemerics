package de.maertinszone.examples.generics.superclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuperclassTest {

	/**
	 * Call of {@link SKitten#tellFoodClass()} will throw a {@link ClassCastException} at Runtime.
	 * To avoid this make {@link SAnimal#getFoodClass()} protected and override it in {@link SKitten}. 
	 */
	@Test
	public void test() {
		assertEquals("My food is Cheese", new SMouse().tellFoodClass());
		assertEquals("My food is Fish", new SCat().tellFoodClass());
		try {
			new SKitten().tellFoodClass();
			fail();
		} catch (ClassCastException e) {
			assertEquals(
					"java.lang.Class cannot be cast to java.lang.reflect.ParameterizedType",
					e.getMessage());
		}
	}

}
