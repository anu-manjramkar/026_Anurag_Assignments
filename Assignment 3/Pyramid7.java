class Pyramid7
{
	public static void main(String args[])
	{
		for(int i=1;i<=8;i=i+2)
		{
			for(int k=6;k>=i-2;k=k-2)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=9;i>=1;i=i-2)
		{
			for(int k=1;k<=9-i;k=k+2)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}