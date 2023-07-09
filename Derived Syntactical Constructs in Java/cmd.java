/*
	Write a program to accept two numbers as command line arguments
	and print the addition of those numbers
*/

class cmd
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int c = a + b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("Addition = " + c);
	}
}