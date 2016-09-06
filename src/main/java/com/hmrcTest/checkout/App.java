package com.hmrcTest.checkout;

/**
 * HMRC Test
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Checkout checkout = new Checkout();
    	System.out.println("Total: " + checkout.getTotal(args));
    }
}
