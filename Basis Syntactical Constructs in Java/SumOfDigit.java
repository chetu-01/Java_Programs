// Write a program to find sum of digit of number entered by user

import java.util.Scanner;

class SumOfDigit
{
	public static void main(String args[])
	{
		int no;
		int r,sum = 0;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter number = ");
		no = in.nextInt();

		for(;no!=0;)
		{
			r = no % 10;
			sum = sum + r;
			no = no / 10;
		}

		System.out.println("Sum of Digits = " + sum);
	}
}