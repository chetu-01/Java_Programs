/*
	Write a program to generate Fibonacci series
	1 1 2 3 5 8 13 21 34 55 89
*/

class Fibo
{
	public static void main(String args[])
	{
		int a = 0, b = 1;
		int c = 0;

		System.out.println(a);
		System.out.println(b);

		while(c!=89)
		{
			c = a + b;

			System.out.println(c);
			a = b;
			b = c;
		}
	}
}