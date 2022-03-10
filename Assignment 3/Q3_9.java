class Q3_9
{
	public static void main(String args[])
	{
		char ch=64;
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}
}