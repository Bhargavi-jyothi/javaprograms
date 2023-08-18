package com.kodnest.methdos.practice;

public class QS3BitSwapper {
 void swapingUsingBitwise(int a,int b) {
	 int temp=a^b;
	     a=temp^a;
	     b=temp^b;
	     System.out.println("values after swapping "+a+" "+b);
	
	
 }
 
}
