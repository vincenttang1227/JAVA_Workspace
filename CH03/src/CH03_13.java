
public class CH03_13
{
	public static void main(String[] args)
	{
		int i , j=0, num=1;
		for ( i=0 ; i<10 ; i++)
		{
			num *= 2;
			if (num > 20)
//				break;
				continue;
			j++;
		}
		System.out.printf (" i=%d¡Aj=%d¡Anum=%d ", i , j , num );
	}
}
