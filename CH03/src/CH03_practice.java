import java.io.*;
public class CH03_practice
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入成績：");
		String st1 = keyin.readLine();
		int num = Integer.parseInt(st1);
		
		if (num < 0)
		{
			System.out.print("輸入為負數\n請重新輸入：");
		}

	}
}
