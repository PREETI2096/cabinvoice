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
@Test
public void givenDistanceTime_shouldReturnMinimumCost() {
	CabInvoiceGenerator cab = new CabInvoiceGenerator();
    double totalFare = cab.calculateTotalFare(0.1,3.0);
    Assert.assertEquals(5.0,totalFare,0.0 );
}
@Test
public void givenMultipleRide_shouldReturnAggregateFare() {
	CabInvoiceGenerator cab = new CabInvoiceGenerator();
	Ride [] rides = {new Ride(4.5,5.0), new Ride(3.5,6)};
	double aggregateFare = cab.calculateTotalFare(rides);
    Assert.assertEquals(50.0, aggregateFare, 0.0 );
}
}