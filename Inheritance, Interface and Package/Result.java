class Student
{
	String name;
	int roll_no;
	int m1,m2;

	Student(String n,int rn,int m1,int m2)
	{
		name = n;
		roll_no = rn;
		this.m1 = m1;
		this.m2 = m2;
	}

}

interface exam
{
	float per_cal();
}

class Result extends Student implements exam
{
	float per;

	Result(String n,int rn,int m1,int m2)
	{
		super(n,rn,m1,m2);

		per = this.per_cal();
	}

	public float per_cal()
	{
		int total = m1 + m2;

		float per = (float)(total*100)/200;
		return per;
	}

	void display()
	{
		System.out.println("Name = " + name);
		System.out.println("Roll no = " + roll_no);
		System.out.println("Marks in m1 = " + m1);
		System.out.println("Marks in m2 = " + m2);

		System.out.println("Percantage = " + per);
	}

	public static void main(String args[])
	{
		Result r = new Result("Shubham",214,67,89);

		r.display();
	}
}