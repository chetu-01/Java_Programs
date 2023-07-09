/*
	Write a program to create an applet for displaying circle, rectangle and
	triangle one below the other & filled them with red, green and yellow
	respectively
*/

import java.applet.*;
import java.awt.*;

public class Shapes extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(50,50,80,80);

		g.setColor(Color.green);
		g.fillRect(40,150,100,75);

		g.setColor(Color.yellow);

		int x[] = {100,50,150,100};
		int y[] = {240,300,300,240};

		g.fillPolygon(x,y,x.length);
	}
}