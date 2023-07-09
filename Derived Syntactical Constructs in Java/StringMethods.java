/*
	Write a java program to implement following functions of string:
	(1) Calculate length of string
	(2) Compare between strings
	(3) Concatenating strings
*/

class StringMethods
{
	public static void main(String args[])
	{
		String str1 = "First_Name";
		String str2 = "Last_Name";
		String str3 = "fIrst_nAmE";

		System.out.println("Lenght of str1 = " + str1.length());

		if(str1.equals(str2))
		{
			System.out.println("str1 and str2 are same...");
		}

		if(str1.equalsIgnoreCase(str3))
		{
			System.out.println("str1 and str2 are same but may differ in case");
		}

		System.out.println("str1 + str2 = " + str1.concat(" " + str2));
	}
}