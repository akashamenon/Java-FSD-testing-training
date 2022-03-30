package day6;

import java.util.Scanner;

public class Encapsulation2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Encapsulation obj1 = new Encapsulation();
		obj1.setvalue(a, b);
		System.out.println("Sum = "+obj1.getValues());
		
	}

}
