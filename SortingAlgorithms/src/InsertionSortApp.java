import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		  System.out.println("enter the legth of an array");
		  int arr[]=new int[scan.nextInt()];
		  System.out.println("enter "+arr.length+" elements into the array");
		  for(int i=0;i<=arr.length-1;i++) {
			  arr[i]=scan.nextInt();
		  }
		  System.out.println("array elements before sorting are...");
		  for (int i : arr) {
			System.out.print(i+" ");
		}
		  System.out.println();
		  InsertionSort sort=new InsertionSort();
		  sort.insertionSort(arr);
		  System.out.println("array elements after sorting in order  are...");
		  for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
