package recentQ;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int[]arr=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min= arr[0];
		
		for(int i=0;i<=size-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min element is "+min+" max element is "+max);
		
		
		
		
	}

}
