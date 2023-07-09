/* 	Describe following methods related to vector
	addElement(), removeElement() & insertElementAt()
*/

import java.util.Vector;

class VectorMethods
{
	public static void main(String args[])
	{
		Vector v = new Vector();

		v.addElement(100);
		v.addElement(200);
		v.addElement(300);

		System.out.println(v);

		v.removeElement(200);

		System.out.println(v);

		v.insertElementAt(55,1);

		System.out.println(v);
	}
}
