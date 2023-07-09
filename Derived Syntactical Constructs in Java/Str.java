/*
	Perform following string/ string buffer operations, write java program
	(i) Accept a password from user
	(ii) Check if password is correct then display “Good”, else display “Wrong”
	(iii) Display the password in reverse order
	(iv) Append password with “welcome”
*/

import java.util.Scanner;

class Str
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String pass;
		String origin = "1234";

		System.out.print("Enter password = ");
		pass = in.nextLine();

		if(pass.equals(origin))
		{
			System.out.println("Good");
		}

		else
		{
			System.out.println("Wrong");
		}

		StringBuffer p = new StringBuffer(pass);

		System.out.println("Reverse = " + p.reverse());

		p = p.append(" Welcome");

		System.out.println(p);
	}
}

