import java.io.*;
public class CH02_15
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入整數字串：");
		String st = keyin.readLine();
		int num = Integer.parseInt(st);
		System.out.println("顯示整數數值：" + num);
	}
}