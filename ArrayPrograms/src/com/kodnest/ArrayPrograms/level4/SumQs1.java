package com.kodnest.ArrayPrograms.level4;

public class SumQs1 {
  int sumOfElementsOfArray(int arr[]) {
	  int sum=0;
	  for(int i=0;i<=arr.length-1;i++) {
		  sum=sum+arr[i];
		  
	  }
	  return sum;
  }
}
