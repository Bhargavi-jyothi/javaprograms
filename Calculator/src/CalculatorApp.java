import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("hello user");
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
	
		while(true) {
			
			System.out.println("+ means addition ");
			System.out.println("- means subtraction ");
			System.out.println("* means multiplication ");
			System.out.println("/ means division ");
			System.out.println("% means remainder ");
			System.out.println("^ means square of number ");
			System.out.println("enter your choice");
			char ch=sc.next().charAt(0);
			if(ch=='!') {
				System.out.println("bye");
				break;
			}
			System.out.println("enter your values");
			int a=sc.nextInt();
			int b=sc.nextInt();
			switch(ch) {
			case '+':
				
				System.out.println("result is"+c.addition( a, b));
				break;
			case '-':
				
				System.out.println("result is"+c.subtraction( a, b));
				break;
			case '*':
				
				System.out.println("result is"+c.multiplication( a, b));
				break;
			case '/':
				System.out.println("result is"+c.division( a, b));
				break;
			case '%':
				System.out.println("result is"+c.modulus( a, b));
				break;
			case '^':
				c.power(a);
				break;
				default:
					System.out.println("enter valid choice");
			
			
			}
			
			
			}
			
		}
		
	}


