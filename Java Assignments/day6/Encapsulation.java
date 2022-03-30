package day6;

public class Encapsulation {
	
	/*private string password;
	private int id;
	public int getId()
	{
		return id;
	}
	public String getpassword()
	{
		return password;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setpass(String password)
	{
		this.password=password;
	}*/
	
	private int a,b;
	public int getValues()
	{
		return a+b;
	}
	
	public void setvalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

}
