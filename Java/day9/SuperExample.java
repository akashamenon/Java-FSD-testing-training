package day9;

class Animal// super-class/ parent-class
{
	String color="white";
}
class SuperExample extends Animal
{
	String color="brown";
	void printcolor()
	{
		System.out.println(color);//brown
		System.out.println(super.color);//white
	}
	public static void main(String[] args)
	{
		SuperExample obj1=new SuperExample();
		obj1.printcolor();
	}
}
