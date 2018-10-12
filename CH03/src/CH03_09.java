public class CH03_09
{
	public static void main(String[] args)
	{
		int  sum = 0;
		for (int n = 1;n<= 10;n++ )
//		while (n <= 10)
		{
			System.out.print("n=" + n);
			sum += n;
			System.out.println("\t SUM=" + sum);
//			n++;
		}
		System.out.println("Loop End");
	}
}