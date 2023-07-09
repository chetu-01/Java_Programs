// Explain type casting with suitable example

class TypeCastExample
{
	public static void main(String args[])
	{
		// Implicit Type Casting - performed by JVM
		//                       - smaller data type to larger data type
		//						 - no loss of data

		int no = 2;

		float f = no;
		double d = no;

		System.out.println("no = " + no);
		System.out.println("f  = " + f);
		System.out.println("d  = " + d);

		// Explicit Type Casting - performed by user
		//                       - larger data type to smaller data type
		//						 - data loss may occur

		long L = 272322;

		int NO = (int)L;

		System.out.println("L  = " + L);
		System.out.println("NO = " + NO);

		float F = 10.56f;

		int I = (int)F;

		System.out.println("F  = " + F);
		System.out.println("I  = " + I);

		String s = "Hi";

		if (s instanceof String)
			System.out.println("Hi");
	}
}