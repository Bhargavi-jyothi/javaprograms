
public class AmstrongNumber {
 public int findAmstrong(int n,int original) {
	 int count=0;
	 while(n!=0) {
		 n=n/10;
		 count++;
	 }
	 int sum=0;
	 while(original!=0) {
		 int rem=original%10;
		 int s=(int) Math.pow(rem,count);
		 sum=sum+s;
		 original=original/10;
	 }
	 return sum;
	 
 }
}
