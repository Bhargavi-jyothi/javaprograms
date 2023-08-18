package com.kodnest.methdos.practice;
import java.util.Scanner;

public class QS5MethodOverloadingApp {

public static void main(String[] args) {		
Scanner scan=new Scanner(System.in);

QS5MethodOverloading methodOverloading=new QS5MethodOverloading();
System.out.println("Enter your choice +,-,*,/");
char choice=scan.next().charAt(0);
switch(choice) {
case'+':System.out.println("Enter first number :");
         int a=scan.nextInt();
         System.out.println("Enter second number :");
         int b=scan.nextInt(); 
         System.out.println("Addition result:"+methodOverloading.calculate(a, b));
         break;
case'-':System.out.println("Enter first number :");
       double c=scan.nextDouble();
      System.out.println("Enter second number :");
       double d=scan.nextDouble();
	    System.out.println("Subtraction result:"+methodOverloading.calculate(d, c));
            break;
case'*':System.out.println("Enter first number :");
float e=scan.nextFloat();
System.out.println("Enter second number :");
float f=scan.nextFloat();
	System.out.println("Multiplication result:"+methodOverloading.calculate(e, f));
          break;
case'/':System.out.println("Enter first number :");
short g=scan.nextShort();
System.out.println("Enter second number :");
short h=scan.nextShort();
System.out.println("Divison result:"+methodOverloading.calculate(h,g ));
          break;
default:System.out.println("enter correct value");
}

	}

}
