import java.io.*;
public class CH04_02_01
{
	public static void main(String[] args)throws IOException
	{
		String[] course = new String[] {"姓名","國文","數學","社會","自然"};
		
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < course.length; i++)
		{
			System.out.print("\n請輸入："+course[i+1]+"成績(0~100)：");
			String st1 = keyin.readLine();
		
			System.out.print(course[i] + "\t");
		}
		System.out.println();
		System.out.print("吳勁律\t");
		
		int[] score = new int[] { 100, 96, 97, 86 };
		int sum = 0;
		for (int i = 0; i < score.length; i++)
		{
			System.out.print(score[i] + "\t\t");
			sum += score[i];
		}
		System.out.println();
		System.out.print("\n總分=" + sum);
		System.out.print("\n平均=" + (float) sum / score.length);
	}
}
