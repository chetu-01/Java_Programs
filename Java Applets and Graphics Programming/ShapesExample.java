/*
	Write syntax and example of
	(i)   drawPolygon(x[],y[],sides/vertices)
	(ii)  drawRect(x,y,w,h)
	(iii) fillOval(x,y,w,h)
	(iv)  drawArc(x,y,w,h,starting_angle,sweeping_angle/ending angle)
*/

import java.applet.*;
import java.awt.*;

public class ShapesExample extends Applet
{
	public void paint(Graphics g)
	{
		int x[] = {100,50,150,100};
		int y[] = {100,200,200,100};

		g.drawPolygon(x,y,x.length);

		g.drawRect(50,250,100,75);

		g.fillOval(50,400,100,75);

		g.drawArc(50,500,100,100,180,180);
	}
}
