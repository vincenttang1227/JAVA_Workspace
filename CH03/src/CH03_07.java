
public class CH03_07
{
	public static void main(String[] args)
	{
		System.out.println("1~10間奇數的和");
		
		int sum = 0;
		
//		System.out.println("所有的奇數：");
		
		for (int i = 1;i <= 10; i += 2)
//		{
//			if (i % 2 !=0)
//			{
				sum += i;
//				System.out.print(i+" ");
//			}
//		}
		System.out.println();
		System.out.print("答案="+sum);
	}
}
