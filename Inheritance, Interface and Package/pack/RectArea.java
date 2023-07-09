// Package class RectArea for importing in PackageExample
package pack;

public class RectArea
{
	private double l;
	private double b;

	public double getArea(double l, double b)
	{
		this.l = l;
		this.b = b;
		return (l*b);
	}
}