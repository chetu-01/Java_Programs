// Write a program to print sum of even numbers from 1 to 20

class Loop
{
	public static void main(String args[])
	{
	   int i,sum = 0;

	   for(i=1; i<20; i++)
	   {
	   		if(i%2==0)
	   		{
	   			sum = sum + i;
			}
		}

	   System.out.println("Sum = " + sum);
	 }
}