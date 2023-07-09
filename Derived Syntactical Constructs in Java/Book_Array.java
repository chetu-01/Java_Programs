/*
	Define a class ‘Book’ with data members bookid, bookname and price.
	Accept data for seven objects using Array of objects and display it.
*/
import java.io.*;

class Book
{
	private int bookid;
	private String bookname;
	private double price;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	void accept()
	{
		try
		{
			System.out.print("Enter Book ID : ");
			bookid = Integer.parseInt(br.readLine());

			System.out.print("Enter Book Name : ");
			bookname = br.readLine();

			System.out.print("Enter Book Price : ");
			price = Double.parseDouble(br.readLine());
		}

		catch(Exception e)
		{
		}
	}

	void display()
	{
		System.out.println("Book ID : "+bookid);
		System.out.println("Book Name : "+bookname);
		System.out.println("Book Price : "+price);
	}
}

class Book_Array
{
	public static void main(String[] args)
	{
		Book[] A = new Book[7];

		int i;

		for(i=0;i<7;i++)
			A[i] = new Book();

		System.out.println("Enter Data : ");
		for(i=0;i<7;i++)
			A[i].accept();

		System.out.println("Inputted Data : ");
		for(i=0;i<7;i++)
			A[i].display();
	}
}