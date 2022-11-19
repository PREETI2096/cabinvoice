package com.bridgelabz.cabinvoice;

import org.junit.Assert;
import org.junit.Test;


public class CabInvoiceTest {
	
@Test
	public void givenDistanceTime_shouldReturnTotalFare() {
		CabInvoiceGenerator cab = new CabInvoiceGenerator();
	    double totalFare = cab.calculateTotalFare(6.0,7.0);
	    Assert.assertEquals(67.0,totalFare,0.0 );
	}
}
