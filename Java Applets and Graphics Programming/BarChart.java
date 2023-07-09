/*
	Write a program to draw a bar chart for plotting
	students passing percentage in last 5 years
*/

import java.applet.*;
import java.awt.*;

public class BarChart extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(50,50,50,400);
		g.drawLine(50,400,600,400);

		g.drawString("Y",50,40);
		g.drawString("X",610,405);

		g.fillRect(100,300,50,100);
		g.fillRect(200,200,50,200);
		g.fillRect(300,250,50,150);
		g.fillRect(400,300,50,100);
		g.fillRect(500,100,50,300);

		g.drawString("2014",110,420);
		g.drawString("2015",210,420);
		g.drawString("2016",310,420);
		g.drawString("2017",410,420);
		g.drawString("2018",510,420);

		int x1=40,y1=50,x2=60,y2=50;

		for(int i=1;i<=9;i++)
		{
			g.drawLine(x1,y1,x2,y2);

			y1 = y1 + 40;
			y2 = y2 + 40;
		}

		x1=20;
		y1=50;

		int per = 90;

		for(int i=1;i<=10;i++)
		{
			g.drawString(Integer.toString(per)+"",x1,y1);

			y1 = y1 + 40;

			per = per - 10;
		}
	}

}