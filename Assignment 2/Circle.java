import java.util.Scanner;
class Circle
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius ");
		double radius=sc.nextDouble();
		final double pi=22.0/7;
		double perimeter=2*pi*radius;
		double area=pi*radius*radius;
		System.out.println("Perimeter is "+perimeter);
		System.out.println("Area is "+area);
		
	}
}