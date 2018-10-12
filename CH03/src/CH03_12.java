
public class CH03_12
{
	public static void main(String[] args)
	{
		int i,j;
		
		for (i=1 ; i<10 ; i++)
		{
			for (j=1 ; j<=i ; j++)
			{
				if (j==5)
					break;
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("¸õ¥XÂù¼h°j°é");
		
		out1:
		{
			for (i=1 ; i<10 ; i++)
			{
				for (j=1 ; j<=i ; j++)
				{
					if (j==5)
						break out1;
					System.out.print(j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}