package com.app.Customer;

public enum Plan_cust {

SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

		
		private double min_plan;
		
	Plan_cust(double min_plan) {
		this.min_plan=min_plan;
	}
	public String toString() {
		return name()+": "+min_plan;
	}
	public double getPlanCost() {
		return min_plan;
	}

	}



