// Write a program to calculating area and perimeter of rectangle

import java.util.Scanner;

class AreaPerimeterRectangle
{
	public static void main(String args[])
	{
		double l,b;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter length = ");

		l = in.nextDouble();

		System.out.print("Enter breadth = ");

		b = in.nextDouble();

		System.out.println("Area = " + (l*b));

		System.out.println("Perimeter = " + (2*(l+b)));
	}
}
