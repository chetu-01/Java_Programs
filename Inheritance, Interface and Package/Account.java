/*
	Write a program to create a class Account having variable accno, accname and balance.
	Define deposite() and withdraw() methods.
	Create one object of class and perform the operation
*/

import java.util.Scanner;

class Account
{
	int accno;
	String accname;
	float balance = 1000;

	Account(int no,String nm)
	{
		accno = no;
		accname = nm;
	}

	void deposit(float d)
	{
		balance = balance + d;
		showBal();
	}

	void withdraw(float w)
	{
		if(w > balance)
		{
			System.out.println("Insufficient balance!");
		}

		else if(w == balance || balance == 1000)
		{
			System.out.println("Minimum balance must be 1000 at least!");
		}

		else
		{
			balance = balance - w;

			showBal();
		}
	}

	void showBal()
	{
		System.out.println("Current Balance = " + balance);
	}


	public static void main(String args[])
	{
		Account a = new Account(123,"Mayur");
		Scanner in = new Scanner(System.in);

		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Exit");

		try
		{
			while(true)
			{
				System.out.print("Enter your choice = ");
				int ch = in.nextInt();
				switch(ch)
				{
					case 1:

					System.out.print("Enter amount to deposit = ");

					float d = in.nextFloat();

					a.deposit(d);
					break;

					case 2:

					System.out.print("Enter amount to withdraw = ");

					float w = in.nextFloat();

					a.withdraw(w);
					break;

					case 3:
					System.out.println("Thanks...");
					System.exit(0);
					break;

					default:
					System.out.println("Invalid Choice...");
				}
			}
		}

		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}