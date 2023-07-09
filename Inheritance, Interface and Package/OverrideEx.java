// Method Overriding Example

class Class1
{
	void show()
	{
		System.out.println("Hi");
	}
}

class Class2 extends Class1
{
	void show()
	{
		System.out.println("Bye");
	}
}

class OverrideEx
{
	public static void main(String args[])
	{
		Class1 A = new Class1();
		A.show();

		A = new Class2();
		A.show();
	}
}
