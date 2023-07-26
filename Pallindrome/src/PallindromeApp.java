import java.util.Scanner;

public class PallindromeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Pallindrome pallindrome=new Pallindrome();
		int rev=pallindrome.reverseOfDigits(n);
		System.out.println("reverse of the number is "+rev);
	    if(n==rev) {
	    	System.out.println("pallindrome");
	    }
	    else {
	    	System.out.println(" not pallindrome");
	    }


	}

}
