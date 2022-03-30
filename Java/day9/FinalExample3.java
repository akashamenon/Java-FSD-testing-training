package day9;

/* final */ class Sample  //If the class is final then it can not be override
{
	void run()
	{
		System.out.println("run method in Sample");
	}
}
class FinalExample3 extends Sample
{
	void run()
	{
		System.out.println("run method in FinalExmp3");
	}
	public static void main(String[] args)
	{
		FinalExample3 a=new FinalExample3();
		a.run();
	}
}
