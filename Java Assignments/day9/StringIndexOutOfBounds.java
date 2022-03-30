package day9;

import java.util.Scanner;

public class StringIndexOutOfBounds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		try {
		char a=str.charAt(str.length());
		System.out.println(a);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}

}
