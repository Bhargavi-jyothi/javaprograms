package com.kodnest.methdos.practice;
import java.util.Scanner;

public class QS4BitCounterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter an integer");
	int a=scan.nextInt();
     QS4BitCounter count=new QS4BitCounter();
      System.out.println("countof set bits :"+count.countSetBits(a));
		}

	}


