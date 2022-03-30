package day9;

class Vehicle
{
	void car()
	{
		System.out.println("Vehicle is Running");
	}
}
class SuperExample2 extends Vehicle
{
	void car()
	{
		System.out.println("Car is Running");
	}
	void test()
	{
		super.car();
	}
	public static void main(String[] args)
	{
		SuperExample2 obj1=new SuperExample2();
		obj1.car();
		obj1.test();
	}
}
