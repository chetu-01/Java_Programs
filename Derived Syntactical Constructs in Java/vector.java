/*
	Write a program to add 2 integer, 2 string and
	2 float objects to a vector.
	Remove element specified by user and display the list.
*/

import java.util.*;

class vector
{
	public static void main(String args[])
	{
		Vector v = new Vector();

		v.addElement(2);
		v.addElement(3);

		v.addElement("ABC");
		v.addElement("PQR");

		v.addElement(2.3f);
		v.addElement(5.6f);

		System.out.println(v);

		System.out.print("Enter index of element you want to remove : ");

		try
		{
			Scanner in = new Scanner(System.in);

			int i = in.nextInt();

			v.removeElementAt(i);
			System.out.println(v);
		}

		catch(Exception e)
		{
			System.out.println("Something went wrong...");
		}
	}
}