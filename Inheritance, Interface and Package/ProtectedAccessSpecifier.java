/*
	Write a java program to implement visibility controls such as
	public, private, <protected> access modes.
	Assume suitable data, if any.
*/

import pack.ClassA;

class ClassB extends ClassA
{
	void display()
	{
		show();
	}
}

class ClassC
{
	void disp()
	{
		ClassA.show();

		// Error - show() has protected access in ClassA
	}
}

class ProtectedAccessSpecifier
{
	public static void main(String args[])
	{
		ClassB B = new ClassB();

		B.display();
	}
}
