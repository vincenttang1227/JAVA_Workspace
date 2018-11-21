package CH08_05;

import java.io.*;

public class CH08_05
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));

		double base, exponent;

		System.out.print("块┏计:");
		base = Double.parseDouble(keyin.readLine());

		System.out.print("块计:");
		exponent = Double.parseDouble(keyin.readLine());

		try
		{
			if (base == 0 && exponent < 0)
				throw new ArithmeticException();

			if (base < 0)
				try
				{
					if (exponent > 0 && exponent < 1)
						throw new ArithmeticException();
				}
				catch (ArithmeticException ex)
				{
					System.out.println("┏计0玥计ぃざ0~1ぇ丁礚猭璸衡");
					return;
				}
			System.out.println("挡狦" + Math.pow(base, exponent));
		}
		catch (ArithmeticException ex)
		{
			System.out.println("┏计单0玥计ぃ0礚猭璸衡");
		}
	}
}
