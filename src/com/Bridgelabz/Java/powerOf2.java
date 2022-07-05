package com.Bridgelabz.Java;

import java.util.Scanner;

public class powerOf2 {

	public static void main(String[] args) {
		System.out.println("Enter the Value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i=0,a=1;
		for(i=0;i<n;i++) {
			if(i==0) {
				System.out.println("Power of 2 raise to 0 is 1");
			}
			else {
				a=a*2;
				System.out.println("Power of 2 raise to "+i+" is "+a);	
			}
		}
	}
}