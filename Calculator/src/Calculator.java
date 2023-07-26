import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
	int p=scan.nextInt();
	public int addition(int a, int b){
			  return a+b;
			
			}
		public int subtraction(int a, int b){
			  return b-a;
		}
		public int multiplication(int a, int b){
			  return a*b;
		
		 
		}
		public int division(int a, int b){
			  return b/a;
		
	}
		public int modulus(int a, int b){
			  return a%b;
		}
		public void power(int p){
			
			  System.out.println(p*p);

		}
	}

