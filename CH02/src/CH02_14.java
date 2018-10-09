import java.io.*;
public class CH02_14
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		String st;
		System.out.print("鍵入字串1：");
		st = keyin.readLine();
		System.out.println("顯示字串1："+st);
		
		System.out.print("鍵入字串2：");
		st = keyin.readLine();
		System.out.println("顯示字串2："+st);
	}
}
