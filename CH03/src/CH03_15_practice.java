import java.io.*;
public class CH03_15_practice
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input a number：");
		String st1 = keyin.readLine();
		int num = Integer.parseInt(st1);
		
		
		int sum = 0;
		for(int i=1 ; i<=num ; i ++)
		{
			if (i%2 == 0)
			sum += i;
		}
		System.out.print("1 ~ "+num+"的偶數總和為："+sum);
	}
}