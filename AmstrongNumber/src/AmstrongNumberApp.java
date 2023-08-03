import java.util.Scanner;

public class AmstrongNumberApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int original=n;
		AmstrongNumber amstrong=new AmstrongNumber();
		int r=amstrong.findAmstrong(n,original);
		if(original==r) {
			System.out.println("amstrong");
		}
		else {
			System.out.println(" not amstrong");
		}
		
	}

}
