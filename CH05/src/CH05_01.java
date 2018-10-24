
public class CH05_01
{
	static double Money(float p, int n)
	{
		double m;
		m = p * n;
		return m;
	}

	public static void main(String[] args)
	{
		float price = 2.3f;
		double tot;
		tot = Money(price, 11);
		System.out.println("tot = "+tot);
	}
}
