package day4;

//performed by changing the type of arguments
class MethodOverloading2
{
	static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		add(11,12.3456);
		add(100,200);
	}
}
