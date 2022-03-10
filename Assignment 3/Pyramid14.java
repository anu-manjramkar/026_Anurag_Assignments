class Pyramid14
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int l=2;l<=5;l++)
		{
			for(int m=5;m>l;m--)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=l;n++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}