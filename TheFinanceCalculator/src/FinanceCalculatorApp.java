import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principal=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));

	}

}
