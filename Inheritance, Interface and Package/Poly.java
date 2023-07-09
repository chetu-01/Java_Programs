// Write a single program to implement inheritance and polymorphism in java

class Person
{
	private String name;
	private int age;

	Person(String n,int a)
	{
		name = n;
		age = a;
	}

	Person(int a,String n)
	{
		name = n;
		age = a;
	}

	@Override public String toString()
	{
		return name + " " + age;
	}
}

class Employee extends Person
{
	private String company;
	private String dept;

	Employee(String n,int a,String c,String d)
	{
		super(n,a);

		company = c;
		dept = d;
	}

	Employee(int a,String n,String c,String d)
	{
		super(a,n);

		company = c;
		dept = d;
	}

	@Override public String toString()
	{
		return company + " " + dept;
	}
}

class Poly
{
	public static void main(String args[])
	{
		Person A = new Person("Mayur",18);

		System.out.println(A.toString());

		A = new Employee("Mayur",18,"Google","HRA");
		System.out.println(A.toString());
	}
}