package com.kodnest.methdos.practice;
import java.util.Scanner;

public class QS2LogicalOperatorValidatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.print("Is input valid(True/False)? :");
         boolean s=scan.nextBoolean();
         System.out.println();
         System.out.print("Does Input meet the certain condition (True/False) :");
         boolean t=scan.nextBoolean();
         System.out.println();
         QS2LogicalOperator logicalOperator=new QS2LogicalOperator();
         boolean res=logicalOperator.validLogicalOperators(s, t);
         if(res==true) {
        	 System.out.println("Input is valid");
         }
         else {
        	 System.out.println("Input is in valid");
         }
         
	}

}
