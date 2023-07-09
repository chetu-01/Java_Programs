/*
	WAP to define two threads,
	one to print 1 to 100 and other to print from 100 to 1.
	First thread transfers control to second thread after a delay of 500 ms
*/

class first implements Runnable
{
	public void run()
    {
		Thread t = Thread.currentThread();

    	for(int i=1;i<=100;i++)
    		System.out.println(i);

    	System.out.println("Thread1 ended");

    	try
    	{
			// Transfer control to second thread after 500 ms
    	   	t.sleep(500);
		}

		catch(Exception e)
		{

		}
    }

}

class second implements Runnable
{
    public void run()
    {
    	for(int i=100;i>=1;i--)
    		System.out.println(i);

		System.out.println("Thread2 ended");
    }
}

public class TestJoin
{
	public static void main(String[] args) throws InterruptedException
   	{
   		Thread th1 = new Thread(new first());
   	   	Thread th2 = new Thread(new second());

   	   	// Start first thread immediately
   	   	th1.start();

   	   	// Start second thread once first thread is dead
		th1.join();

   	   	th2.start();
   	}
}
