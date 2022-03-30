package day8;

import java.util.*;

class StringSplit
{
	public static void main(String[] args)
	{
		String sample=new String("Hello, my name is Akash , I am 23 years old");
		String[] sentences=sample.split(",");
		for(int i=0;i<sentences.length;i++)
		{
			System.out.println(sentences[i].trim());//it will remove the white spaces and print only the required String value
		}
	}
}
