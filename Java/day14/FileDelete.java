package day14;

import java.io.File;

class FileDelete
{
	public static void main(String[] args)
	{
		File f1=new File("D:FileCreate.txt");
		if(f1.delete())
		{
			System.out.println(f1.getName()+" file is deleted");
		}
		else
		{
			System.out.println("Some unexpected error in deleting the file");
		}
	}
}
