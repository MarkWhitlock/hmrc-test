package com.hmrcTest.checkout;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {

	private Checkout checkout;
	
	@Before
	public void setUp() throws Exception {
		checkout = new Checkout();
	}

	@Test
	public void checkApplesCosts60p() {

		assertEquals("0.60",checkout.getTotal(new String[]{"Apple"}));
	}

	@Test
	public void checkOrangessCosts25p() {

		assertEquals("0.25",checkout.getTotal(new String[]{"Orange"}));
	}

	@Test(expected = IllegalArgumentException.class)
	public void checkForInvalidItems()
	{
		checkout.getTotal(new String[]{"Grape"});
	}
	
	@Test
	public void checkSimpleBasket() {
		assertEquals("0.85",checkout.getTotal(new String[]{"Apple","Orange"}));
	}

	@Test
	public void checkBiggerBasket() {
		assertEquals("2.05",checkout.getTotal(new String[]{"Apple","Apple","Orange","Apple"}));
	}
}
