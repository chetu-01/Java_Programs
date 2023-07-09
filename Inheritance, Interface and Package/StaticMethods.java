// Which are the restrictions present for static declared methods ?

class Test
{
	int no;

	static void show()
	{
		System.out.println("No. = " + no);
		// Error - non-static variable no cannot be referenced from a static context
	}
}

class StaticMethods
{
	public static void main(String args[])
	{
		Test.show();
	}
}

/* Restrictions - static methods can only access static members
				- cannot access non-static instance variables
				- static methods cannot be overriden
				- this and super cannot be used
				- no need to create object to call static methods
				- static methods belong to entire class
				- memory allocation is done only once
*/