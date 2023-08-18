package com.kodnest.practice.methodwithcontrolconstructs;

public class QS3PrimeRangeFinder {
	boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	 void findPrime(int a,int b) {
		 QS3PrimeRangeFinder primeRangeFinder=new QS3PrimeRangeFinder();
		 System.out.print("Prime numbers within given range are:");
		 for(int i=a;i<=b;i++) {
			 boolean prime=primeRangeFinder.isPrime(i);
			 if(prime==true) {
				 System.out.print(i+" ");
				 
			 } 
		 }
	
		
	 }

}
