package com.kodnest.practice.methodwithcontrolconstructs;

import java.util.Scanner;

public class QS3PrimeRangeFinderApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the two numbers to find prime number between that range");
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 QS3PrimeRangeFinder primeRangeFinder=new QS3PrimeRangeFinder();
		 primeRangeFinder.findPrime(a, b);

	}

}
