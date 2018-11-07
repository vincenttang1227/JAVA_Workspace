package CH06_02;


class Triangle
{
	private int base;
	private int height;
	private double ans;
	
	public void setData(int b, int h)
	{
		base=b;
		height=h;
		Area();
	}
	
	public double outArea()
	{
		return ans;
	}
	
	private void Area()
	{
		ans = (base*height)/2;
		System.out.println("經由public setData()方法，間接設定，底="+base+"，高="+height+"\n");
	}	
}

public class CH06_02
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		
		int base=2, height=8;
		double ans;
		
		triangle.setData(base, height);
		ans=triangle.outArea();
		
		System.out.println("經由public outArea()方法，間接傳回三角形面積為"+ans+"\n");
	}
}