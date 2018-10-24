import java.io.*;
import java.util.*;

public class CH05_practice_01
{
	public static void main(String[] args) throws IOException
	{
		long t1, t2, tot;
		int num1, num2, ans;
		int score = 0;
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n按<<Enter>>後即開始做答");
		int p = System.in.read();
		Date date_time = new Date();
		System.out.println("開始作答時間為：" + date_time);
		t1 = System.currentTimeMillis();

		for (int i = 0; i < 4; i++)
		{
			num1 = (int) (Math.random() * 16 + 1);
			num2 = (int) (Math.random() * 10 + 1);
			System.out.println(num1 + " * " + num2 + " = :");
			ans = Integer.parseInt(keyin.readLine());
			if (ans == num1 * num2)
			{
				System.out.println("第 "+i+"題，答對了");
				score += 25;
			}
			else
			{
				System.out.println("第 "+i+"題，答錯了");
				System.out.println("正確答案為："+(num1*num2));
			} 
		}
		t2 = System.currentTimeMillis();
		System.out.println("作答完畢，結束時間為：" + date_time);
		System.out.println("共使用時間："+(t2-t1)+"毫秒");
		System.out.println("共使用："+((t2-t1)/1000)+"秒");
	}
}
