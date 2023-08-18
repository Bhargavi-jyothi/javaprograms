import java.util.Scanner;

public class SearchingSortingTechniquesApp {
public static void main(String[] args) {
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
	  SearchingSortingTechniques searchSort=new SearchingSortingTechniques();
	  System.out.println("1-----> SelectionSort");
	  System.out.println("2-----> InsertioSort");
	  System.out.println("3-----> BubbleSort");
	  System.out.println("any other-----> SelectionSort");
	  int choice=scan.nextInt();
	  switch(choice) {
	  case 1:searchSort.selectionSort(arr);
	         break;
	  case 2:searchSort.insertionSort(arr);
             break;
	  case 3:searchSort.bubbleSort(arr);
             break;
      default:searchSort.selectionSort(arr);
              break;  
	         
	  }
	  System.out.println("array elements after sorting are...");
	  for (int i : arr) {
		System.out.print(i+" ");
	}
	  System.out.println();
	  System.out.println("enter the key to search");
	  int key=scan.nextInt();
	  int res=searchSort.binarySearch(arr, key);
	  if(res>0) {
		  System.out.println("key found at index "+res);
	  }
	  else {
		  System.out.println("key not found");
	  }
	  }
	  
	  
}


