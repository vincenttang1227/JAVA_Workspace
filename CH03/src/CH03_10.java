public class CH03_10
{
	public static void main(String[] args)
	{
		int n = 40, m = 180, temp = 0;
		System.out.println("n=" + n + ",m=" + m);
		do
		{
			temp = m % n;
			m = n;
			n = temp;
		}
		while (n != 0);
		System.out.println("兩數的最大公因數為" + m);
	}
}