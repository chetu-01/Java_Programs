// Explain float wrapper with its methods

class Wrapper
{
	public static void main(String args[])
	{
		Float f = new Float(2.3f);

		System.out.println(f);

		String ff = "5.6";

		float F = Float.parseFloat(ff);

		System.out.println(F);

		String fs = f.toString();

		System.out.println(fs);
	}
}