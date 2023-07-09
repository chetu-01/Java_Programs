/*	Write a java program to copy the content of the file
	“file1.txt” into new file “file2.txt”
*/

import java.io.*;

class CopyContents
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("file1.txt");

		FileWriter w = new FileWriter(f1);

		w.write("Testing files");

		w.close();

		FileReader r = new FileReader(f1);

		int ch;
		w = new FileWriter("file2.txt");

		while((ch = r.read()) != -1)
		{
			w.write((char)ch);
		}

		w.close();
	}
}