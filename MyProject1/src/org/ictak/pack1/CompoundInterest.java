package org.ictak.pack1;

public class CompoundInterest {
	void compound() {
	double principle, rate, time, compound_interest;
    principle = 100000;
    rate = 5;
    time = 2;
    System.out.printf("----------Compound Interest-----------\nPrinciple amount: %f \nInterest rate: %f \nTime period %f years" , principle, rate, time);
    compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
    System.out.println("\nThe Compound Interest is: " + compound_interest + "\n");
	}

}
