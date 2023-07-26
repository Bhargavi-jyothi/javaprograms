import java.util.Scanner;
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N value");
		int n=sc.nextInt();
		int fact=1;
		if(n==0) {
			System.out.println("fact is 0");
		}
		else if(n==1){
			System.out.println("fact is 1");
		}
		else{
		for(int i=2;i<=n;i++) {
			fact=fact*i;	
		}
		System.out.println("fact is " +fact);

	}
	}

}
