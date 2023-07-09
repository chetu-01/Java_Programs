/*
	With proper syntax and example explain following graphics methods:
	1) SetColor() 2) SetForeGround() 3) getFont() 4) setSize()
*/

import java.applet.*;
import java.awt.*;

public class AppletMethods extends Applet
{
	public void init()
	{
		// Syntax - setSize(width,height)
		//		  - setSize(Dimension obj)
		Dimension D = new Dimension(400,400);

		setSize(D);

		// sets default foreground color for the entire applet
		setForeground(Color.blue);

		// sets default background color for the entire applet
		setBackground(Color.black);

		setFont(new Font("Times New Roman",Font.PLAIN + Font.BOLD + Font.ITALIC,30));
		System.out.println(getFont());
	}

	public void paint(Graphics g)
	{
		g.setFont(new Font("Arial",Font.PLAIN + Font.BOLD + Font.ITALIC,30));

		System.out.println(g.getFont());

		g.drawString("Hi",200,200);

		g.setColor(Color.red);
		g.drawString("Bye",200,300);
	}
}