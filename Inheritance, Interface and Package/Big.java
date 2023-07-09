/*
	Create a class ‘Rectangle’ that contains ‘length’ and ‘width’ as data members.
	From this class derive class box which has additional data member ‘depth’.
	Class ‘Rectangle’ consists of a constructor and an area ( ) function.
	The derived ‘Box’ class have a constructor and override function named area ( )
	which returns surface area of ‘Box’ and a volume ( ) function.
	Write a java program calling all the member function
*/

class Rectangle
{
	int length,width;

	Rectangle(int length,int width)
	{
		this.length = length;
		this.width = width;
	}

	void area()
	{
		System.out.println("Area = " + length*width);
	}
}

class Box extends Rectangle
{
	int depth;

	Box(int length,int width,int depth)
	{
		super(length,width);
		this.depth = depth;
	}

	void area()
	{
		System.out.println("Volume = " + (2*(length*width+width*depth+length*depth)));
	}

	void volume()
	{
		System.out.println("Volume = " + (length*width*depth));
	}
}

class Big
{
	public static void main(String args[])
	{
		Rectangle R = new Rectangle(2,3);

		R.area();

		Box B = new Box(2,3,4);

		B.area();
		B.volume();
	}
}