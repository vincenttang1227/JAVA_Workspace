public class CH04_03
{

	public static void main(String[] args)
	{
		String[] arr1 = new String[] { "座號", "國文", "英文", "數學", "最高分", "最低分" };
		int[][] arr2 = new int[][] { { 1, 92, 88, 76 }, { 2, 90, 98, 70 }, { 3, 82, 69, 98 } };
		
		for (int r = 0; r < arr1.length; r++)
			System.out.print(arr1[r] + "\t");
		
		System.out.println();
		
		int max = 0, min = 100;
		for (int i = 0; i < arr2.length; i++)
		{
			for (int j = 0; j < arr2[i].length; j++)
			{
				if (arr2[i][j] > max)
					max = arr2[i][j];
				if(j>0)
				  if (arr2[i][j] < min)
					min = arr2[i][j];
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.print(max + "\t" + min);
			System.out.println();
		}
	}
}