import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double inches=sc.nextDouble();
		HeightConverter converter = new HeightConverter();

       System.out.printf("%.2f",converter.convertInchesToFeet(inches));

	}

}
