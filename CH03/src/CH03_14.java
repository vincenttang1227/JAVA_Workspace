public class CH03_14
{
	public static void main(String[] args)
	{
		int i, j;
		
		for (i = 1; i < 10; i++)
		{
			for (j = 1; j <= i; j++)
			{
				if (j == 5)
					continue;
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		out1: 
		for (i = 1; i < 10; i++)
		{
			for (j = 1; j <= i; j++)
			{
				if (j == 5)
					continue out1;
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
}
