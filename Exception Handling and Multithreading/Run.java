// Write a java program to implement runnable interface with example

class Thread1 implements Runnable
{
	public void run()
	{
		System.out.println("Hi");
	}
}

class Run
{
	public static void main(String args[])
	{
		Thread1 t = new Thread1();

		Thread T = new Thread(t);

		T.start();
	}
}