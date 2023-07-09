// Write any four methods of File Input stream class give their syntax

import java.io.*;

class FileInput
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		File f = new File("ABC.txt");

		FileInputStream is = new FileInputStream(f);
		int b;

		try
		{
			while((b=is.read())!=-1)
			{
				System.out.print((char)b);
			}
		}

		finally
		{
			try
			{
				is.close();
			}

			catch(IOException e)
			{
			}
		}
	}
}