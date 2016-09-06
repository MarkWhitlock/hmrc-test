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
		int appleCount  = 0;
		int orangeCount = 0;
		for (String item: items)
		{
			CheckoutItem cItem = CheckoutItem.valueOf(item);

			if (cItem == CheckoutItem.Apple)
			{
				// Every second apple is free
				if (appleCount == 1)
				{
					appleCount = 0;
					continue;
				}
				appleCount++;	
			}
			else if (cItem == CheckoutItem.Orange)
			{
				// Every third orange is free
				if (orangeCount == 2)
				{
					orangeCount = 0;
					continue;
				}
				orangeCount++;	
			}
			
			total += prices.get(cItem);
		}
		return String.format("£%.2f", total);
	}
}
