/*
	Write a java program to implement visibility controls such as
	public, <private>, protected access modes.
	Assume suitable data, if any.
*/

class Number
{
	private static int no;

	Number(int n)
	{
		no = n;
	}
}

class PrivateAccessSpecifier
{
	public static void main(String args[])
	{
		Number N = new Number(3);

		System.out.println("Number - " + N.no);
		// Error - no has private access in Number
	}
}