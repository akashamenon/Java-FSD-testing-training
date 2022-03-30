package day9;

class Example
{
	final void test()
	{
		System.out.println("test method in Example class");
	}
}
class FinalExample2 extends Example
{
	void test2()
	{
		System.out.println("test method in FinalExample2 class");
	}
	public static void main(String[] args)
	{
		FinalExample2 a=new FinalExample2();
		a.test2();
	}
}
