/*
	Write a java program to implement multilevel inheritance
	with 4 levels of hierarchy
*/

class Person
{
	private String nm;
	private int age;

	Person(String n,int a)
	{
		nm=n;
		age=a;
	}

	void show()
	{
		System.out.println("Name - "+nm);
		System.out.println("Age  - "+age);
	}

}
class Student extends Person
{
	private int roll;
	Student(String n,int a,int rn)
	{
		super(n,a);
		roll=rn;
	}

	void show1()
	{
		System.out.println("Roll No. - "+roll);
	}

}
class Monitor extends Student
{
	private int yr;

	Monitor(String n,int a,int rn,int y)
	{
		super(n,a,rn);
		yr=y;
	}

	void show2()
	{
		System.out.println("Year - "+yr);
	}
}
class Topper extends Monitor
{
	private double per;
	Topper(String n,int a,int rn,int y,double p)
	{
		super(n,a,rn,y);
		per=p;
	}
	void show3()
	{
		System.out.println("Percentage - "+per);
	}
}

class Multilevel
{
	public static void main(String args[])
	{
		Topper A=new Topper("ABC",17,220,2019,92.76);
		A.show();
		A.show1();
		A.show2();
		A.show3();
	}
}