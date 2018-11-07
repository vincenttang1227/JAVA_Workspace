import java.io.*;

public class CH05_practice_02
{
	public static void bubbleSort(int A[])
	{
		int i, j, k, t;
		System.out.println("\n\nA陣列降冪排列的過程：");

		for (i = A.length - 2; i >= 0; i--)
		{
			for (j = 0; j <= i; j++)
			{
				if (A[j] < A[j + 1])
				{
					t = A[j + 1];
					A[j + 1] = A[j];
					A[j] = t;
				}
			}

			System.out.print("第" + (A.length - 1 - i) + "次：");

			for (k = 0; k < A.length; k++)
				System.out.print(A[k] + " ");

			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException
	{
		int A[];
		int i;

		System.out.println("請輸入陣列長度(2~10之間)：");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int sc = Integer.parseInt(keyin.readLine());

		if (sc < 2 || sc > 10)
		{
			do
			{
				System.out.print("輸入錯誤，請重新輸入(2~10之間)：");
				sc = Integer.parseInt(keyin.readLine());
			}
			while (sc < 2 || sc > 10);
		}

		A = new int[sc];
		
		System.out.println();

		for (i = 0; i < A.length; i++)
		{
			System.out.print("請輸入第" + (i + 1) + "個元素值(1~100之間)：");
			sc = Integer.parseInt(keyin.readLine());

			if (sc < 1 || sc > 100)
			{
				do
				{
					System.out.print("輸入錯誤，請重新輸入(1~100之間)：");
					sc = Integer.parseInt(keyin.readLine());
				}
				while (sc < 1 || sc > 100);
			}
			A[i] = sc;
		}

		System.out.println("\nA陣列排序前的順序:");
		for (i = 0; i < A.length; i++)
			System.out.print(A[i] + "\t");

		bubbleSort(A);

		System.out.println("\nA陣列降冪排序的結果：");

		for (i = 0; i < A.length; i++)
			System.out.print(A[i] + "\t");
	}
}
