/*
	Write an applet to accept username in the form of
	parameter and print “Hello <username>”
*/

import java.applet.*;
import java.awt.*;

public class Param extends Applet
{
	public void paint(Graphics g)
	{
		String name = getParameter("user");

		g.drawString("Hello <" + name + ">",300,200);
	}
}

/* <applet code = Param height = 500 width = 500>
<param name = "user" value = "ABC">
</applet> */