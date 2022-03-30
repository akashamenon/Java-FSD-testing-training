package day3;

import java.util.Scanner;

public class SmallestTernaryOperator {
	
	public static void main(String[] args)
	{
		int temp, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        temp = a < b ? a:b;
        result = c < temp ? c:temp;
        System.out.println("Smallest Number is : "+result);
    }

}
