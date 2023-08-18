package com.kodnest.methdos.practice;

public class QS1CalculateTax {
double calculateTotalWithTax(double purchaseAmount,double taxRate) {
	double totalAmount=purchaseAmount+purchaseAmount*taxRate;
	return totalAmount;
}
}
