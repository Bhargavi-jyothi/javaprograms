package com.kodnest.practice.methodwithcontrolconstructs;

public class QS1FactorialSum {
 int findFactorial(int n) {
	 int fact=1;
	 if(n==0) {
		 return 0;
	 }
	 else if(n==1){
		 return fact;
	 }
	 else {
		 for(int i=2;i<=n;i++) {
			 fact=fact*i;
		 }
		 return fact;
	 }
 }
 int findSum(int n) {
	 int sum=0;
	 QS1FactorialSum factorialSum=new QS1FactorialSum();
	 for(int i=0;i<=n;i++) {
		 sum=sum+factorialSum.findFactorial(i);
	 }
	 return sum;
 }

}

