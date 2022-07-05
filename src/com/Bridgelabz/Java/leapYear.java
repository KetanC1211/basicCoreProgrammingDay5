package com.Bridgelabz.Java;

import java.util.Scanner;
public class leapYear {
	public static void main(String[] args) {
	//number should be divisible by 4 or 400 but it should not be divisible by 100
	System.out.println("Enter the year");
	Scanner sc = new Scanner(System.in);
		int y =sc.nextInt();
		if(y%100==0||y%4!=0){
			if(y%400==0) {
				System.out.println(y+ " is a leap year");
			}
			else {
			System.out.println(y+ " is not a leap year");
			}
		}
		else {
			System.out.println(y+ " is a leap year");
		}
	}
}
