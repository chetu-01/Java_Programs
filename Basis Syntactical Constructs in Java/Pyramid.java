/*	Write a program to print the following output :
	1 1 1 1 1
	2 2 2 2
	3 3 3
	4 4
	5
*/

class Pyramid
{
	public static void main(String args[])
	{
		int i,j;

		for(i=1;i<=5;i++)
		{
			System.out.println();

			for(j=5;j>=i;j--)
			{
				System.out.print(i + " ");
			}
		}
	}
}