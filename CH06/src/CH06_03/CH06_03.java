package CH06_03;

class Triangle
{
	public int ibase=10;
	public int iheight=20;
	
	public double dbase=10.0;
	public double dheight=20.0;
	
	public int Area()
	{
		return (ibase*iheight)/2;
	}
	
	public int Area(int b)
	{
		ibase=b;
		return(ibase*iheight)/2;
	}
	
	public int Area(int b,int h)
	{
		ibase=b;
		iheight=h;
		return(ibase*iheight)/2;
	}
	
	public double Area(double b, double h)
	{
		dbase=b;
		dheight=h;
		return(dbase*dheight)/2;
	}
}

public class CH06_03
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		
		int ibase=2,iheight=8,ians;
		double dbase=2.5,dheight=8.5,dans;
		
		ians=triangle.Area();
		System.out.println("沒有傳入值的Area()方法，三角形面積為"+ians+"\n");
		
		ians=triangle.Area(ibase);
		System.out.println("傳入一個整數值的Area()方法，三角形面積為"+ians+"\n");
		
		ians=triangle.Area(ibase,iheight);
		System.out.println("傳入兩個整數值的Area()方法，三角形面積為"+ians+"\n");
		
		dans=triangle.Area(dbase,dheight);
		System.out.println("傳入兩個double值的Area()方法，三角形面積為"+dans+"\n");

	}

}
