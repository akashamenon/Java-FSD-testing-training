package day9;

class Flower
{
	Flower()
	{
		System.out.println("Flower class constructor is called");
	}
}
class SuperExample3 extends Flower
{
	SuperExample3()
	{
		super();
		System.out.println("sub class constructor is called");
	}
	public static void main(String[] args)
	{
		SuperExample3 a=new SuperExample3();
	}
}
