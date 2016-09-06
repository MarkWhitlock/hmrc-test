package com.hmrcTest.checkout;

import java.util.Hashtable;

public class Checkout {

	private Hashtable<CheckoutItem,Double> prices = new Hashtable<CheckoutItem,Double>();
	
	public Checkout()
	{
		super();
		
		prices.put(CheckoutItem.Apple , 0.60);
		prices.put(CheckoutItem.Orange, 0.25);
	}
	
	public String getTotal(String[] items)
	{
		Double total = 0.0;
		
		for (String item: items)
		{
			total += (prices.get(CheckoutItem.valueOf(item)));
		}
		return String.format("%.2f", total);
	}
}
