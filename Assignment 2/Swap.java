import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number 1 ");
		int n1=sc.nextInt();
		System.out.print("Enter Number 2 ");
		int n2=sc.nextInt();
		int n3=n1;
		System.out.println("Values of n1&n2 Before Swap n1= "+n1+" n2= "+n2);
		n1=n2;
		n2=n3;
		System.out.println("Values of n1&n2 After Swap n1= "+n1+" n2= "+n2);
	}
}