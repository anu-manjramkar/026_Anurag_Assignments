import java.util.Scanner;
class Even
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number ");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.print(" Number is Even ");
		}
		else
				System.out.print(" Number is Odd ");
	}
}