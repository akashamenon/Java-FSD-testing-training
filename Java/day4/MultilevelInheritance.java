package day4;

//multilevel inheritance
class Car
{
	void vehicleType()
	{
	System.out.println("Vehicle Type: Car");
	}
}
class Benz extends Car
{
	void brand()
	{
	System.out.println("Brand: Benz");
	}
}
class Vclass extends Benz{
	void sports()
	{
		System.out.println("Vclass is sporty");
	}
}
class MultilevelInheritance
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Vclass obj=new Vclass();
		obj.sports();
		obj.brand();
		obj.vehicleType();
	}
}