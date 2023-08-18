package com.kodnest.ArrayPrograms.level2;

public class PrintArrayQuestion2 {
	int[]printArray(int arr[] ){
		System.out.println("Array contents in forward direction are.......");
		for ( int i : arr) {
			System.out.print(i+" ");
	}
		System.out.println();
		System.out.println("Array contents  reverse direction are.......");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		return null;
		
	}

}
