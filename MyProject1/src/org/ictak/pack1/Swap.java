package org.ictak.pack1;

public class Swap {
	void swap () {
	int val1 , val2, temp;
   // System.out.println("\n The required packages have been imported");
    val1 = 45;
    val2 = 70;
    System.out.println("\n\n-------Swap--------\n----Before swap----");
    System.out.println("< " + val1 + " > <" + val2 + ">" );
    temp = val1;
    val1 = val2;
    val2 = temp;
    System.out.println("----After swap----");
    System.out.println("<" + val1 + " > < " + val2 +">" );

	}
}
