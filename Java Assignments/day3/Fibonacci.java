package day3;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int count, num1 = 0, num2 = 1;
		System.out.println("How many numbers you want in the sequence");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.close();
		System.out.println("Fibonacci Series of " +count+ " Numbers");
		int i=1;
		while(i<=count) {
			System.out.print(num1+ " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			i++;
		}
		
	}

}
