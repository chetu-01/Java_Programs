// Write a program to check wheater given number is prime or not

class Prime
{
	public static void main(String args[])
	{
		int no = 12;

		int c = 2;

		while(no % c != 0)
		{
			c++;
		}

		if(no == c)
		{
			System.out.println("Prime");
		}

		else
		{
			System.out.println("Not Prime");
		}
	}
}