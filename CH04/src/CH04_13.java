import java.util.Arrays;

public class CH04_13
{
	public static void main(String[] args)
	{
		int[] account = { 18, 14, 12, 16, 10 };

		System.out.println("排序前的資料順序：");
		for (int i = 0; i < account.length; i++)
			System.out.print(account[i] + "\t");

		Arrays.sort(account);

		System.out.println("\n\n排序後的資料順序：");
		for (int i = 0; i < account.length; i++)
			System.out.print(account[i] + "\t");
	}
}
