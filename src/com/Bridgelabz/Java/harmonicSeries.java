package com.Bridgelabz.Java;
import java.util.Scanner;

public class harmonicSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");

        int num = in.nextInt(),i;
        double result = 1;
        String hseries = String.valueOf(1);

        // using for loop
        for (i = 2; i <=num; i++) {
             // updating series using string
        	hseries = hseries + "+(1/"+String.valueOf(i)+")";
        	result = result + (double)1 /i;
        } 
        
        System.out.println(hseries);
        System.out.println("The sum of harmonic series for n = "+num+" is "+result);
	}
}
