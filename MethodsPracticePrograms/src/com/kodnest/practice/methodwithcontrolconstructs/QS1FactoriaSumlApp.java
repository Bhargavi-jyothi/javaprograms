package com.kodnest.practice.methodwithcontrolconstructs;

import java.util.Scanner;

public class QS1FactoriaSumlApp {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the range upto which we have to find the sum of factorial of numbers");
	 int n=scan.nextInt();
	 QS1FactorialSum factorialSum=new QS1FactorialSum();
	 int res=factorialSum.findSum(n);
	 System.out.println("sum of factorial of numbers upto given range is  "+res);

	}

}
