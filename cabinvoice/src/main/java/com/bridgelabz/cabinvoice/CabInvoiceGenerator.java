package com.bridgelabz.cabinvoice;

public class CabInvoiceGenerator {
	
	static final double MINIMUM_COST=5.0;
	static final double PER_KILOMETER=10.0;
	static final double PER_MIN=1.0;
  
	public double calculateTotalFare(double distance, double time) {
		double cost = PER_KILOMETER*distance + PER_MIN*time;
		return cost< MINIMUM_COST ? MINIMUM_COST:cost;
	}
	public double calculateTotalFare(Ride[] rides) {
		double totalCost = 0.0;
		for(Ride r : rides) {
	    totalCost += this.calculateTotalFare(r.getDistance(),r.getTime());      
		return totalCost;
	}
		return totalCost;
	}
}
