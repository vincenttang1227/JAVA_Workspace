import java.io.*;
import java.util.Arrays;

public class CH04_13_1
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input the length of array:");
		int leng = Integer.parseInt(keyin.readLine());
		
		if (leng<2 || leng >10)
		{
		  System.out.print("Wrong number, Input again:");
		  leng = Integer.parseInt(keyin.readLine());
		}
		else
		{
			int num[] = new int[leng];			
		}


		
		for (int i=0;i<leng;i++)
		{
			System.out.print("Input thevalue of array:");
			int value = Integer.parseInt(keyin.readLine());
			
			num[i]=value
		}

		
		
	}

}
