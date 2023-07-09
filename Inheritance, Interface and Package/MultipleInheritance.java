// Write a program to demonstrate multiple inheritances

interface Mother
{
	void setMother(String n);
}

interface Father
{
	void setFather(String n);
}

class Child implements Mother,Father
{
	String cname;
	String mname;
	String fname;

	public void setChild(String n)
	{
		cname = n;
	}

	public void setFather(String n)
	{
		fname = n;
	}

	public void setMother(String n)
	{
		mname = n;
	}

	void show()
	{
		System.out.println("Mother Name = " + mname);
		System.out.println("Father Name = " + fname);
		System.out.println("Child Name  = " + cname);
	}
}

class MultipleInheritance
{
	public static void main(String args[])
	{
		Child C = new Child();

		C.setChild("Shubham");
		C.setFather("Rajendra");
		C.setMother("Surekha");

		C.show();
	}
}