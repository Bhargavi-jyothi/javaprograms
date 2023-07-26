import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("ask the user to enter input");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++) {
        	sum=sum+i;
        }
        System.out.println(sum);
	}
	}


