/*
	super for - calling constructor of super class
	          - calling super class methods
	          - accessing super class instance variables
*/

class Person
{
	String name;
	int age;

	Person(String n,int a)
	{
		name = n;
		age = a;
	}

	void show()
	{
		System.out.println("Name = " + name);
		System.out.println("Age  = " + age);
	}
}

class Student extends Person
{
	String college;

	Student(String n,int a,String c)
	{
		super(n,a);

		college = c;
	}

	void disp()
	{
		super.show();
		System.out.println("College = " + college);
	}

	void display()
	{
		System.out.println("Name = " + super.name);
		System.out.println("Age  = " + super.age);
		System.out.println("College = " + college);
	}
}

class SuperFinal
{
	public static void main(String args[])
	{
		Student S = new Student("Chetan",18,"SSP");

		S.disp();

		S.display();
	}
}
