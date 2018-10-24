public class CH05_02
{
	static void Change(int x, int y)
	{
		int t;
		t = x;
		x = y;
		y = t;

		System.out.println("Change方法中：");
		System.out.println("x = " + x + "\ty = " + y);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int x = 3, y = 5;

		System.out.println("在main中呼叫Change方法前：");
		System.out.println("x = " + x + "\ty = " + y);

		System.out.println();

		Change(x, y);

		System.out.println("在main中呼叫Change方法後：");
		System.out.println("x = " + x + "\ty = " + y);
	}
}
