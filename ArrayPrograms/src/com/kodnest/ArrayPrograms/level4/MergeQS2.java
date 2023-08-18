package com.kodnest.ArrayPrograms.level4;

public class MergeQS2 {
	int []mergeArray(int arr1[],int arr2[]){
		int arr3[]=new int[arr1.length+arr2.length];
		int index=0;
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[index]=arr1[i];
			index++;
		}
		for(int i=0;i<=arr2.length-1;i++) {
			arr3[index]=arr2[i];
			index++;
		}
		return arr3;
	}

}
