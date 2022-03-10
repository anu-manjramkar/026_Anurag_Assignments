import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter Radius ");
		double radius=sc.nextDouble();
		final double pi=3.142;
		double area=pi*radius*radius;
		System.out.print(" Area of Circle = "+area);
	}
}	