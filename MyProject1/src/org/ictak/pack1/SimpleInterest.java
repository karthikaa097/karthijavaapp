package org.ictak.pack1;

public class SimpleInterest {
	void simple() {
		 float principle, rate, time, simple_interest;
	      principle = 100000;
	      rate = 5;
	      time = 2;
	      System.out.printf("---------Simple Interest-----------\nPrinciple amount: %f \nInterest rate: %f \ntime period: %f years" , principle, rate, time);
	      simple_interest = (principle*rate*time)/100;
	      System.out.println("\nThe Simple Interest is: " + simple_interest + "\n");
	   }

}


