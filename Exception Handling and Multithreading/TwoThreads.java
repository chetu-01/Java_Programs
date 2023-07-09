/*
	Write a program to create two threads,
	so one thread will print even numbers between 1 to 10
	whereas other will print odd numbers between 11 to 20
*/

class First extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}

class Second extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			if(i%2==1)
				System.out.println(i);
		}
	}
}

class TwoThreads
{
	public static void main(String args[])
	{
		First F = new First();
		Second S = new Second();

		F.start();
		S.start();
	}
}