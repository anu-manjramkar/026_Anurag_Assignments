import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter a Number ");
		int num=sc.nextInt();
		int temp=0;
		for(int i=1;i<11;i++)
		{
			temp=i*num;
			System.out.println(+num+" * "+i+" = "+temp);
		}
		
	}
}