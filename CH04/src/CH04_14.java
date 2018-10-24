import java.util.Arrays;

public class CH04_14
{
	public static void main(String[] args)
	{
		int[] account = {18,14,12,16,10,28,22,30,26,32,36,34,24,20};
		
		System.out.print("Before sort:");
		for (int i=0;i<account.length;i++)
			System.out.print(account[i]+"\t");
		
		Arrays.sort(account,5,10);
		
		System.out.print("\n\nAfter sort:");
		for (int i=0;i<account.length;i++)
			System.out.print(" "+account[i]+"\t");		

	}

}
