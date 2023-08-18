package com.kodnest.methdos.practice;
import java.util.Scanner;

public class QS1TaxCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Enter purchase amount");
double purchaseAmount=scan.nextDouble();
System.out.println("Enter tax rate");
double taxRate=scan.nextDouble();
QS1CalculateTax calculate=new QS1CalculateTax();
double res=calculate.calculateTotalWithTax(purchaseAmount, taxRate);
System.out.println("Total amount including Tax rate is "+res);
	}

}
