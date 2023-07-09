/*
	Describe following string class method with example :
	(i) compareTo()
	compares first character on the basis of ASCII characters

	(ii) equalsIgnoreCase()
	compares for equality ignoring the String case

*/

class StringMethods2
{
	public static void main(String args[])
	{
		String str1 = "PQR";
		String str2 = "ABC";
		String str3 = "pqr";

		if(str1.compareTo(str2)>0)
		{
			System.out.println("str1 is greater...");
		}

		else
		{
			System.out.println("str2 is greater...");
		}

		System.out.println(str1.equalsIgnoreCase(str3));
	}
}