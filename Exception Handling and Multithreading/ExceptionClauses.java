/*
	Explain following clause w.r.t. exception handling :
	(i) try (ii) catch (iii) throw (iv) finally 
*/

class FailException extends Exception
{
	FailException(String msg)
	{
		super(msg);
	}
}

class ExceptionClauses
{
	public static void main(String args[])
	{
		int marks;

		marks = 45;

		try
		{


			if(marks < 28)
			{
				FailException E =  new FailException("You are failed!!!");
				throw (E);
			}

			else
				System.out.println("Congrats!!!");
		}
			
		catch(FailException e)
		{
			System.out.println(e);
		}

		finally
		{
			System.out.println("End of code...");
		}

		/*
			finally block - always executed whether exception is caught or not
						  - can be placed after try or catch block
		*/
	}
}