package day9;

class StaticExample
{
	static int count=0; // a.count, b.count, c.count
	StaticExample()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		StaticExample a=new StaticExample();
		StaticExample b=new StaticExample();
		StaticExample c=new StaticExample();	
	}
}
