package com.kodnest.practice.methodwithcontrolconstructs;

import java.util.Scanner;

public class QS4PerfectNumberCheckerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the number for which we have to find the divisors");
		 int n=scan.nextInt();
		 int original=n;
		 QS4PerfectNumberChecker perfectNumberChecker=new QS4PerfectNumberChecker();
		int res=perfectNumberChecker.findDivisor(n);
		 if(original==res) {
			 System.out.println("Given number "+original+" is a perfect number");
		 }
		 else {
			 System.out.println("Given number "+original+" is not  a perfect number");
		 
		 }
	}

}
