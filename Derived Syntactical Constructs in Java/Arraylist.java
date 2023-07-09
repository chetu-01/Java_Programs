// ArrayList and Iterator methods

import java.util.*;

public class Arraylist
{
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Shruti");
        al.add("Yash");
        al.add("Chetan");
        al.add("Maithili");
        al.add("Rushi");

        Iterator<String> it = al.iterator();

		System.out.println(al.contains("Rushi"));

		it.next();

		it.remove();

		while(it.hasNext())
		{
		    String name = it.next();
		    System.out.println(name);
		}

		Object x = al.clone();

		System.out.println(x);

		al.addAll(al);

		System.out.println(al);

		al.remove(0);

		System.out.println(al);
	}
}