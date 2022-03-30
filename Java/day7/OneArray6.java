package day7;

//program to take input of students of a class and their marks in Bio,Chem,Physics and calculate the the avg score in science
import java.util.*;

class OneArray6
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		int studentsno=sc.nextInt();
		System.out.println("Enter the name of the student followed by their marks in Biology, Chemistry, Physics");
		String[] names=new String[studentsno];
		int[] bio=new int[studentsno];
		int[] chem=new int[studentsno];
		int[] physics=new int[studentsno];
		double[] avg=new double[studentsno];
		for(int i=0;i<studentsno;i++)
		{
			names[i]=sc.next();
			bio[i]=sc.nextInt();
			chem[i]=sc.nextInt();
			physics[i]=sc.nextInt();
		}
		for(int i=0;i<studentsno;i++)
		{
			avg[i]=(double)(bio[i]+chem[i]+physics[i])/3;
		}
		System.out.println("The Average marks of science is : ");
		for(int i=0;i<studentsno;i++)
		{
			System.out.println(names[i]+" Science marks="+avg[i]);
		}
	}
}
