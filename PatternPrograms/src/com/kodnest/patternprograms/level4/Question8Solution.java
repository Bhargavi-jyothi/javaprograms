package com.kodnest.patternprograms.level4;

public class Question8Solution {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
			System.out.print("*");
			}
			System.out.println();
		}


	}

}
