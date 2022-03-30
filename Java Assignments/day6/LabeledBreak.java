package day6;

public class LabeledBreak {
	
	public static void main(String[] args) {
		
		ii:
			for(int i=0;i<=5;i++)
			{
				jj:
					for(int j=0;j<=5;j++)
					{
						if(i==3&&j==3)
						{
							break ii;
						}
						System.out.println(i+ " " +j);
					}
			}
		
	}

}
