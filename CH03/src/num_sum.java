import java.io.*;

public class num_sum
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入數字1：");
		String st1 = keyin.readLine();
		int num1 = Integer.parseInt(st1);
		
		System.out.print("請輸入數字2：");
		String st2 = keyin.readLine();
		int num2 = Integer.parseInt(st2);
		
		do
		{
			if (num2 <= num1)
			{
				System.out.println("請輸入數字1：");
				st1 = keyin.readLine();
				num1 = Integer.parseInt(st1);
				
				System.out.println("請輸入數字2：");
				st2 = keyin.readLine();
				num2 = Integer.parseInt(st2);
			}
		}while (num2 <= num1);
		
		int sum=0;
		for (int i = num1; i <= num2; i++)
			sum += i;
		System.out.println(num1+"到"+num2+"的總和為"+sum);
	}
}
