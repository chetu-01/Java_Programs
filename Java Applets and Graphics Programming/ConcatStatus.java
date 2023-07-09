/*
	Write an applet program that accepts two input, strings using <Param> tag
	and concatenate the strings and display it in status window
*/

import java.awt.*;
import java.applet.*;

public class ConcatStatus extends Applet
{
	public void paint(Graphics g)
	{
		String s1 = getParameter("str1");
		String s2 = getParameter("str2");

		String s3 = s1 + s2;

		showStatus(s3);
	}
}

/*
	<applet code = "ConcatStatus" height = 500 width = 500>
	<param name = "str1" value = "Hi... ">
	<param name = "str2" value = "Welcome">
	</applet>
*/