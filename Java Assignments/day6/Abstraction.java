package day6;

import java.util.Scanner;

abstract class AbstractClass
{
	abstract int getSum(int a, int b);     //abstract method
	abstract int getDiff(int a, int b);    //abstract method
	double getDivision(int a, int b)       //non abstract method
	{
		return (double)a/b;
	}
}
class ChildClass extends AbstractClass
{
	int getSum(int a, int b)
	{
		return a+b;
	}
	int getDiff(int a, int b)
	{
		return a-b;
	}
}

public class Abstraction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		AbstractClass t = new ChildClass();
		System.out.println("Sum = "+t.getSum(a, b));
		System.out.println("Difference = "+t.getDiff(a, b));
		System.out.println("Division = "+t.getDivision(a, b));
		
	}

}
