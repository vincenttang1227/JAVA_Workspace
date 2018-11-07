package CH06_04;

class Triangle
{
	public double dbase, dheight;

	public Triangle()
	{
		dbase = 10.0;
		dheight = 20.0;
		System.out.println("建構子Triangle()中定義，底=" + dbase + "，高=" + dheight);
	}

	public Triangle(double b, double h)
	{
		dbase = b;
		dheight = h;
		System.out.println("建構子接收Triangle(double b,double h)傳入的值，底=" + dbase + "，高=" + dheight);
	}

	public double Area()
	{
		return (dbase * dheight) / 2;
	}

	public double Area(double b, double h)
	{
		dbase = b;
		dheight = h;
		System.out.println("建構子接收dtriangle.Area(dbase,dheight)接收傳入的兩個double值，底=" + dbase + "，高=" + dheight);
		return (dbase * dheight) / 2;
	}
}

public class CH06_04
{

	public static void main(String[] args)
	{
		double dbase = 2.5, dheight = 8.5, dans;

		Triangle triangle = new Triangle();
		dans = triangle.Area();
		System.out.println("沒有傳入值的Area()方法，三角形面積為" + dans + "\n");

		Triangle dtriangle = new Triangle(dbase, dheight);
		dbase = 5.5;
		dheight = 10.5;
		dans = dtriangle.Area(dbase, dheight);
		System.out.println("傳入兩個double的Area(dabse,dheight)方法，三角形面積為" + dans + "\n");
	}

}
