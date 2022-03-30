package day1;
//
//import java.util.Scanner;
//
//public class Basics {
//
//	public static void main(String[] args) {
//		
//		double a,b,c;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the First Value");
//		a=s.nextDouble();
//		System.out.println("Enter the Second Value");
//		b=s.nextDouble();
//		c=a+b;
//		System.out.println("sum="+c);
//
//	}
//
//}

import java.util.Scanner;
class Basics
{	static int samp=5;//global variable (class varaible)
	public static void main(String[] args)
	{
		double a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first value");
		a=s.nextDouble();
		System.out.println("enter the Second value");
		b=s.nextDouble();
		c=a+b;
		System.out.println("sum="+c);
		showsample();
	}
	public static void showsample()
	{
		int x=15;//local variable
		System.out.print(x);
	}
}
