class Pyramid5
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i=i+2)
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
	}
}