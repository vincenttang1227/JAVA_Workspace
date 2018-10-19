public class CH04_09
{

	public static void main(String[] args)
	{
		int[] A=new int[]{1,2,3,4,5};
		int[] B=new int[A.length];
		System.out.println("顯示A陣列的元素內容：");
		for (int i=0;i<A.length;i++)
			System.out.print(A[i]+"\t");
		
		System.out.println("\n\n顯示B陣列的元素內容：");
		for (int i=0;i<B.length;i++)
			System.out.print(B[i]+"\t");
		
		System.out.println("\n\n用arraycopy方法，複製A陣列的元素值到B陣列中...\n");
		System.arraycopy(A,0,B,0,5);
				
		System.out.println("顯示B陣列的元素內容：");
		for (int i=0;i<B.length;i++)
			System.out.print(B[i]+"\t");		
		
	}

}