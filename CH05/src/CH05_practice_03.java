import java.io.*;

public class CH05_practice_03
{
	static int k = 0;
	
	public static void move(int n, char a,char b,char c)
	{
		if(n==1)
		{
			System.out.println("盤"+n+" 由 "+a+" 移至 "+c);
			k++;
		}
		else
		{
			move(n-1,a,c,b);
			System.out.println("盤"+n+" 由 "+a+" 移至 "+c);
			move(n-1,b,a,c);
			k++;			
		}
	}

	public static void main(String[] args)throws IOException
	{
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("請輸入盤數(3~10)：");
		int n = Integer.parseInt(keyin.readLine());
		
		if(n<3 || n>10)
		{
			do
			{
				System.out.print("輸入錯誤，請重新輸入盤數(3~10)：");
				n = Integer.parseInt(keyin.readLine());
			}while(n<3 || n>10);
		}
		
		System.out.println();
		move(n,'A','B','C');
		System.out.println();
		System.out.print("共移動盤子"+k+"次");
	}

}
