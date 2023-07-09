/*	With proper syntax and example explain following thread methods :
	(1) wait() (2) sleep() (3) resume() (4) notify()
*/

class Thread1 extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();

		System.out.println("I am Thread1!");

		try
		{
			Thread.sleep(4000);
		}

		catch(InterruptedException e)
		{

		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("I am Thread2!");
	}
}

class ThreadMethods
{
	public static void main(String args[])
	{
		Thread1 A = new Thread1();
		Thread2 B = new Thread2();

		A.start();
		B.start();
	}
}