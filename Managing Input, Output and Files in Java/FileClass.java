/*
	Write any four methods of file class with their use
*/

import java.io.*;

class FileClass
{
	public static void main(String args[])
	{
		File f = new File("testing.txt");

		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.delete());
	}
}