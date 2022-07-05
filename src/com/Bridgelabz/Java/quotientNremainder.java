package com.Bridgelabz.Java;

import java.util.Scanner;

public class quotientNremainder {
	public static void main(String[] args){
		int n,d,r,q;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a Dividend :");
	      n = sc.nextInt();
	      System.out.println("Enter a Divisor :");
	      d = sc.nextInt();
	      r=n%d;
	      q=(int)((n-r)/d);
	      System.out.println("Quotient is "+q);
	      System.out.println("Remainder is "+r);
	}
}
