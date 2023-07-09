/*
	Write a program to create a vector with seven elements as
	(10, 30, 50, 20, 40, 10, 20).
	Remove element at 3rd and 4th position.
	Insert new element at 3rd position
	Display original and current size of vector.
*/

import java.util.Vector;

class VectorAddElements
{
	public static void main(String args[])
	{
		Vector v = new Vector();

		v.addElement(10);
		v.addElement(30);
		v.addElement(50);
		v.addElement(20);
		v.addElement(40);
		v.addElement(10);
		v.addElement(20);

		System.out.println("Original Vector Elements = ");
		System.out.println(v);
		System.out.println("Original Vector Size = " + v.size());

		v.removeElementAt(2);
		v.removeElementAt(3);

		v.insertElementAt(11,2);

		System.out.println("Current Vector Elements = ");
		System.out.println(v);
		System.out.println("Current Vector Size = " + v.size());

	}
}