// Write a java program to extend interface assuming suitable data

class InterfaceExtending
{
	public static void main(String args[])
	{

		Test A=new Test();
		A.show();
		A.display();
	}
}

interface Person
{
	String nm="ABC";

	void show();
}

interface Student extends Person
{
	int sem=4;

	void display();
}

class Test implements Student
{
	public void show()
	{
		System.out.println("Name - "+nm);
	}
	public void display()
	{
		System.out.println("Semister - "+sem);
	}
}