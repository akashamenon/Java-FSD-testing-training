package day9;

class StaticExample2
{
	static int cube(int x)//static method
	{
		return x*x*x;
	}
	int square(int x)//non-static method
	{
		return x*x;
	}
	public static void main(String[] args)
	{
		int result=cube(3);//27
		StaticExample2 obj=new StaticExample2();
		int res=obj.square(5);//25
		System.out.println(result);
		System.out.println(res);
	}
}
