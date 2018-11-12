package Ch07_02;

class CLine
{
	protected int leng;

	CLine()
	{
		System.out.println("\n執行CLine類別不帶引數的建構子");
	}

	CLine(int x, int y)
	{
		System.out.println("執行CLine(int x, int y)類別帶兩個引數的建構子");
		System.out.println("傳入建構子的引數x=" + x + "，y=" + y);
	}

	public void SetLeng(int l)
	{
		leng = l;
		System.out.println("直線長度=" + leng);
	}
}

class CRectangle extends CLine
{
	private int wide;

	CRectangle()
	{
		System.out.println("執行CRectangle類別不帶引數的建構子");
	}

	CRectangle(int x, int y)
	{
		System.out.println("執行CRectangle類別有兩個引數的建構子");
		System.out.println("傳入建構子的引數x=" + x + "，y=" + y);
	}

	public void SetValue(int l, int w)
	{
		leng = l;
		wide = w;
		System.out.println("矩形長度=" + leng);
		System.out.println("矩形寬度=" + wide);
	}

}
public class Ch07_02
{

	public static void main(String[] args)
	{
		CLine sha1 = new CLine();
		sha1.SetLeng(20);
		System.out.println("\n===========================");
		CRectangle sha2 = new CRectangle();
		sha2.SetValue(10, 5);
		System.out.println("\n===========================");
		CRectangle sha3 = new CRectangle(2, 3);
		sha2.SetValue(10, 5);
	}

}
