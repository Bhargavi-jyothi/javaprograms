package com.kodnest.methdos.practice;
import java.util.Scanner;

public class QS3BitSwapperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number 1 value");
        int a=scan.nextInt();
        System.out.println("Enter number 2 value");
        int b=scan.nextInt();
        System.out.println("Number values before swapping:" +a+" "+b);
        QS3BitSwapper swapper=new QS3BitSwapper();
        swapper.swapingUsingBitwise(a, b);
	}

}
