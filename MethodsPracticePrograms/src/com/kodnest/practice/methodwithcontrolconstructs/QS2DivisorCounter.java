package com.kodnest.practice.methodwithcontrolconstructs;

public class QS2DivisorCounter {
int findDivisor(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	return count;
}
}
