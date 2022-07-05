package com.Bridgelabz.Java;
import java.util.Scanner;

public class flipCoinPercentage {
  public static void main(String[] args) {
	System.out.println("Enter the number of times you want to toss coin");
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),h=0,t=0;
   
    for(int i=0;i<n;i++) {
    	if (Math.random() <0.5) {
    		System.out.print("T ");
    		t++;
    	}
    	else {
    		System.out.print("H ");
    		h++;
    	}
    }
    double headPercentage = (h*100)/n;
    double tailPercentage = (t*100)/n;
    System.out.println("");
    System.out.println("Head Percentage is "+headPercentage);
    System.out.println("Tail Percentage is "+tailPercentage);
  }
}


