package day4;

import java.util.Scanner;

public class MethodOverloadingNumberOfArguments {

	int getresult(int a)
	{
		return a*a;
	}
	int getresult(int a,int b,int c)
	{
		return a+b+c;
	}
	int getresult(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		int x,y,z;
		System.out.println("enter 3 integer");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		MethodOverloadingNumberOfArguments obj=new MethodOverloadingNumberOfArguments();
		System.out.println("Square of number "+x+" = " +obj.getresult(x));
		System.out.println("Addition of numbers "+x+","+y+" and "+z+" = " +obj.getresult(x,y,z));
		System.out.println("Multiplication of numbers "+x+" and "+y+" = " +obj.getresult(x,y));
	}

}
