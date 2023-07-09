// Scope of Variables

class Scope
{
	private static int no = 2;

	void show()
	{
		int local = 3;
	}

	void display()
	{
		System.out.println(local); // Error
	}

	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
		}

		System.out.println(i); // Error

		System.out.println(Scope.no);
	}
}