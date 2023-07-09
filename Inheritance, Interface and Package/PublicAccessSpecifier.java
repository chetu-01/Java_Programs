/*
	Write a java program to implement visibility controls such as
	<public>, private, protected access modes.
	Assume suitable data, if any.
*/

class Number
{
	public int no;

	Number(int n)
	{
		no = n;
	}
}

class PublicAccessSpecifier
{
	public static void main(String args[])
	{
		Number N = new Number(2);

		System.out.println("Number - " + N.no);
	}
}
