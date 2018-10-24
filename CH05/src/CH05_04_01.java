import java.io.*;

public class CH05_04_01
{
	static long Fact(int n)
	{
		if (n == 1 || n == 0)
			return 1;
		else
			return n * Fact(n - 1);
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input a number(1~20): ");

		while (true)
		{
			int num = Integer.parseInt(keyin.readLine());
			if (num < 0 || num > 20)
				System.out.println("Wrong number,Input again: ");
			num = Integer.parseInt(keyin.readLine());
			if (num == -9999)
				break;
			System.out.println(num + "! = " + Fact(num));
		}
	}
}
