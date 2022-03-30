package day9;

class ThisExample
{
	int sum;
	ThisExample(int example)
	{
		this.sum=example;
	}
	void display()
	{
		System.out.println("sum="+sum);
	}
	public static void main(String[] args)
	{
		ThisExample obj=new ThisExample(500);
		obj.display();
		ThisExample two=new ThisExample(750);
		two.display();

	}
}
