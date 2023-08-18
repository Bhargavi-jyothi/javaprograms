package com.kodnest.practice.methodwithcontrolconstructs;

import java.util.Scanner;

public class QS2DivisorCounterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the number for which we have to find the divisors");
		 int n=scan.nextInt();
		
		 QS2DivisorCounter divisorCounter=new QS2DivisorCounter();
		 System.out.println("number of divisors of "+n+" is "+divisorCounter.findDivisor(n));
		 
	}

}
