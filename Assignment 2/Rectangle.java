import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Width ");
		double width=sc.nextDouble();
		System.out.print("Enter Height ");
		double height=sc.nextDouble();
		double area=width*height;
		double perimeter=2*(height+width);
		System.out.println("Area is "+width+"*"+height+"="+area);
		System.out.print("Perimeter is 2*("+width+"+"+height+")="+perimeter);
		
	}
}