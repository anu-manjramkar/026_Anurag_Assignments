class Pyramid8
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			
			System.out.println();
		}
		for(int k=1;k<=5;k++)
		{
			for(int l=5;l>=k;l--)
			{
				System.out.print("*");	
			}
			
			System.out.println();
		}
	}
}