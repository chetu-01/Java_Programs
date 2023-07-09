// Importance of 'super' & 'this' in Inheritence

class Class1
{
	int no;

	Class1(int no)
	{
		this.no = no;
	}
}

class Class2 extends Class1
{
	int no;

	Class2(int no,int n)
	{
		super(no);

		this.no = n;
	}

	void show()
	{
		System.out.println("Class1 = " + super.no);
		System.out.println("Class2 = " + this.no);
	}
}

class thisInInh
{
	public static void main(String args[])
	{
		Class2 A = new Class2(2,3);

		A.show();
	}
}