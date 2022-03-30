package day7;

import java.util.Scanner;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array limit ");
		 n=sc.nextInt();		 
			 int [] arr=new int[n];
			 	System.out.println("Enter the values");
			 	for(i=0;i<n;i++)
			 	{
			 		arr[i]=sc.nextInt();
			 	}
			 	System.out.println("The array elements are :-");
			 	for(i=0;i<n;i++)
			 	{
			 		for(int j=i+1;j<n;j++)
			 		{
			 			if(arr[i]==arr[j])
			 			{
					 		System.out.println(arr[j]);
			 			}
			 		}
			 	}
	}

}
