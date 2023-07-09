// Write a program to create a package and import the package in another class
//							   (pack)                           (PackageExample)

import pack.RectArea;

class PackageExample
{
	public static void main(String[] args)
	{
		RectArea A = new RectArea();

		System.out.println("Area of Rectabgle = " + A.getArea(2,5));
	}
}