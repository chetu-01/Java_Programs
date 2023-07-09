/*
	Explain the following methods of string class with syntax and example :
	(i) substring() (ii) replace()
*/

class StringMethods1
{
	public static void main(String args[])
	{
		String s = "Hi this is a String";

		System.out.println(s.substring(0,4));
		// Hi t

		System.out.println(s.substring(8));
		// is a String

		System.out.println(s.replace("Hi","Bye"));
		// Bye this is a String

		System.out.println(s.replace('i','h'));
		// Hh thhs hs a Strhng
	}
}