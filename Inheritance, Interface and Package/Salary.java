interface Gross
{
	int ta = 2000,da = 4000;
	int gross_sal();
}

class Employee
{
	String name;
	int basic_sal;

	Employee(String n,int b)
	{
		name = n;
		basic_sal = b;
	}
}

class Salary extends Employee implements Gross
{
	int hra;

	Salary(String n,int b,int h)
	{
		super(n,b);

		hra = h;
	}

	public int gross_sal()
	{
		return basic_sal + ta + da + hra;
	}

	void disp_sal()
	{
		System.out.println("Name - " + name);
		System.out.println("Salary - " + gross_sal());
	}

	public static void main(String args[])
	{
		Salary s = new Salary("Mayur",10000,1000);

		s.disp_sal();
	}
}