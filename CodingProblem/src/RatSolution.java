import java.util.Scanner;
public class RatSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// taking input from user
				Scanner sc=new Scanner(System.in);
		        int r=sc.nextInt();
		        int unit=sc.nextInt();
				int n=sc.nextInt();
		        int arr[]=new int[n];
		        for(int i=0;i<=arr.length-1;i++) {
		        	//System.out.println("enter array element at"+i);
		      
		        	arr[i]=sc.nextInt();
		    }
		        //function call
		        System.out.println(ratSolution(r,unit,arr,n));
		        }  
		        public static int ratSolution(int r,int unit,int arr[],int n){
		        	// if array is null we have to return 0
		        	if(arr==null){
		        		return -1;
		        	}
		              int total=r*unit;
		              int sum=0;
		              int count=0;
		              for(int i=0;i<=arr.length-1;i++) {
		            	  sum=sum+arr[i];
		            	  // for execution of loop increase the value of count
		            	  count=count+1;
		            	  // if the sum of all elements  is less than total then break the loop
		            	  if(sum>=total) {
		            		   break;
		                  }   	  
		            
		}
		             if(sum<total) {
		          		return 0;
		             }
		          	  
		              return count;

		        }
		}


