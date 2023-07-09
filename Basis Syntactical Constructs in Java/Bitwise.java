/*
	Explain following bitwise operator with an example :
	(1) left shift operator (2) right shift operator
*/

class Bitwise
{
	public static void main(String args[])
	{
		int a = 12; // Binary - 0000 1100
		int b = 5;  // Binary - 0000 0101

		System.out.println("a = " + a);

		System.out.println("a >> 2 = " + (a >> 2));

		/*
			a >> 2
			i.e. 0000 1100 >> 2 = 0000 0011
		*/

		System.out.println("b << 1 = " + (b << 2));

		/*
			b << 2
			i.e. 0000 0101 << 2 = 0001 0100
		*/
	}
}