package com.kodnest.ArrayPrograms.level2;

public class SwapQuestion1 {
	int[]swapArray(int arr[],int n1,int n2) {
		int temp;
		for(int i=0;i<=arr.length-1;i++) {
			temp=arr[n2];
			arr[n2]=arr[n1];
			arr[n1]=temp;
		}
		return arr;
	}

}
