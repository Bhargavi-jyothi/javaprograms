import java.util.Random;
import java.util.Scanner;
public class NumberGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method
		 Scanner scan =new Scanner(System.in);
         Random random=new Random();
         System.out.println("welcome to Number guess game");
         System.out.println("I have guessed the number between 1-100 try to find it out ");
         int num=(int)(Math.random()*100)+1;
         boolean k=false;
         int count=1;
         while(!k) {
         System.out.println("enter your guess number");
         int guess=scan.nextInt();

         if(guess==num) {
        	 k=true;
        	 System.out.println("your guess is correct");
        	 System.out.println("you took "+count+" attempts to guess the number correctly");
             
         }
         else if(guess<num) {
        	 System.out.println("it is too low try again");
        	 
         }
         else {
        	 System.out.println(" it is too high try again");
        	 
         }
         count++;
         
	}
	}
}

         