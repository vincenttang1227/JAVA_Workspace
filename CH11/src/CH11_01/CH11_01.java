package CH11_01;

import java.io.*;

public class CH11_01
{
	public static void main(String[] args)
	{
		String path_name = "c:\\javadir";
		File myDir = new File(path_name);

		if (myDir.exists())
			System.out.println(path_name + "已經存在");
		else
			System.out.println(path_name + "尚未建立");

		if (myDir.mkdir())
			System.out.println(path_name + "資料夾建立成功");
		else
			System.out.println(path_name + "資料夾建立失敗");
	}
}
