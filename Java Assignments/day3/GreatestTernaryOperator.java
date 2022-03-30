package day3;

import java.util.Scanner;

public class GreatestTernaryOperator {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;

		d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("Greatest Number is : "+d); 

	}
}
