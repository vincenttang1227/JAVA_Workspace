import java.io.*;

public class leap_year
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("請輸入四位數西元年：");
		String st1 = keyin.readLine();
		int year = Integer.parseInt(st1);
		
		do
		{
			if (year <= 0 || year > 10000)
			{
				System.out.print("輸入錯誤，請重新輸入(最多四位數字)：");
				st1 = keyin.readLine();
				year = Integer.parseInt(st1);
			}
		}while(year<=0 || year>10000);
		
		System.out.println();
		
		if (year %4 != 0)
			System.out.println(year+"不是閏年");
		else if (year %100 == 0)
			{
				if (year%400==0)
					System.out.println(year+"是閏年");
				else
					System.out.print(year+"不是閏年");
		}
		else
			System.out.print(year+"是閏年");
	}
}
