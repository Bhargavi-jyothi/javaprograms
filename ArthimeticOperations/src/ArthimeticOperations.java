
public class ArthimeticOperations {

	public static void main(String[] args) {
		
		int s=subtractNumbers(20,5);
		System.out.println(s);

		 int m=multiplyNumbers(4,5);
		 System.out.println(m);

		 double d=divideNumbers(20,4);
		 System.out.printf("%.2f\n",d);

		int r= findRemainder(10,3);
		System.out.println(r);
	} 
		public static int subtractNumbers(int num1, int num2) {
			return num1-num2;
		}

		public static int multiplyNumbers(int num1, int num2) {
			return num1*num2;
		}

		public static double divideNumbers(int num1, int num2) {
			return num1/num2;
		}

		public static int findRemainder(int num1, int num2) {
			return num1%num2;
		}

	}


