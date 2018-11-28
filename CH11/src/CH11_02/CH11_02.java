package CH11_02;

import java.io.*;

public class CH11_02
{
	public static void main(String[] args)
	{
		String file_name = "c:\\javadir\\javatest.txt";
		File myFile = new File(file_name);

		if (myFile.exists())
			System.out.println(file_name + "已經存在");
		else
			System.out.println(file_name + "尚未建立");
		
		try
		{
		if (myFile.createNewFile())
			System.out.println(file_name + "檔案建立成功");
		else
			System.out.println(file_name + "檔案建立失敗");
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
