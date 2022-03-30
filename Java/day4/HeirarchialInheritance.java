package day4;

//Heirarchial Inheritance
class Vehicle
{
	void run()
	{
	System.out.println("Vehicle is Running");
	}
}
class Mahindra extends Vehicle
{
	void color()
	{
		System.out.println("Mahindra is Brown Color");
	}
}
class Bmw extends Vehicle{
	void race()
	{
		System.out.println("Bmw is on Racing Mode");
	}
}
class HeirarchialInheritance
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Bmw obj = new Bmw();
		obj.run();
		obj.race();
		Mahindra m = new Mahindra();
		m.color();
	}
}



