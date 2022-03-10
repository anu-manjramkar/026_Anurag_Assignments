import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number 1 ");
		int n1=sc.nextInt();
		System.out.print("Enter Number 2 ");
		int n2=sc.nextInt();
		System.out.print("Enter Number 3 ");
		int n3=sc.nextInt();
		double average=(n1+n2+n3)/3.0;
		System.out.println(" Average of Three numbers = "+average);
	}
}