package day8;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String");
		String s2 = sc.nextLine();
		System.out.println("The entered string are " + s1 + " , " + s2);
		boolean result = false;
		result = s1.contains(s2);
		System.out.println(result);
		
	}

}
