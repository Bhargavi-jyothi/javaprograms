import java.util.Scanner;
public class JaggedArray {
	public static void main(String[] args) {
			
				Scanner scan=new Scanner(System.in);
				System.out.println("enter 1d length of an array");
				int arr[][][]=new int[scan.nextInt()][][];
				for(int i=0;i<=arr.length-1;i++) {
					System.out.println("enter 2d length for 1d");
					arr[i]=new int[scan.nextInt()][];
					for(int j=0;j<=arr[i].length-1;j++) {
						System.out.println("enter 3d length for 1d,2d");
						arr[i][j]=new int[scan.nextInt()];
				}
				}
				for(int i=0;i<=arr.length-1;i++) {
					for(int j=0;j<=arr[i].length-1;j++) {
						for(int k=0;k<=arr[i][j].length-1;k++) {
							System.out.println("enter the elemet of "+i+", "+j+", "+k);
							arr[i][j][k]=scan.nextInt();
						}
					}
				}
				for(int i=0;i<=arr.length-1;i++) {
					for(int j=0;j<=arr[i].length-1;j++) {
						for(int k=0;k<=arr[i][j].length-1;k++) {
							System.out.print(arr[i][j][k]+" ");
						}
						System.out.println();
					}
					System.out.println("=================");
				}

			}

		

	}


