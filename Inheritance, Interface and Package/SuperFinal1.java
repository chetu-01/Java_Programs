/*
	final for - restricting class inheritance
			  - restricting method overriding
			  - restricting changing literal values
*/

final class Class1
{
	final double PI = 3.14;

	final void show()
	{
		System.out.println("Hi...");
		PI = 3.14; // Error2
	}
}

class Class2 extends Class1 // Error1
{
	void display()
	{
		System.out.println("Bye...");
	}

	void show() // Error3
	{
		System.out.println("Trying to override final method...");
	}
}

class SuperFinal1
{
	public static void main(String args[])
	{
		Class2 A = new Class2();

		A.show();
		A.display();
	}

}

/*
	Error1 - cannot inherit from final Class1
	Error2 - cannot assign a value to final variable PI
	Error3 - show() in Class2 cannot override show() in Class1; overridden method is final
*/