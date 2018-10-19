import java.io.*;

public class CH04_11
{
	public static void main(String[] args) throws IOException
	{
		int[] account = { 18, 14, 12, 16, 10 };
		String[] name = { "王五", "張三", "陳二", "李四", "鄭一" };

		System.out.println("員工編號\t姓名");
		for (int i = 0; i < account.length; i++)
		{
			System.out.print(account[i] + "\t\t");
			System.out.println(name[i]);
		}

		System.out.print("\n使用線性搜尋法，請輸入要找的員工編號：");
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		int search_num = Integer.parseInt(keyin.readLine());

		int num = -1;
		for (int i = 0; i < account.length; i++)
			if (account[i] == search_num)
			{
				num = i;
				break;
			}

		if (num == -1)
			System.out.println("\n 查無此編號");
		else
		{
			System.out.println("\n員工編號\t姓名");
			System.out.println(account[num] + "\t\t" + name[num]);
		}
	}
}