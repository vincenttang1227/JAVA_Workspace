package CH11_04;

import java.io.*;

public class CH11_04
{
	public static void main(String[] args)
	{
		File myFile = new File("c:\\javadir\\stu.txt");
		
		if(!myFile.exists())
			System.out.println("檔案不存在！");
		else
		{
			String data;
			
			try
			{
				FileReader fileread=new FileReader(myFile);
				BufferedReader filein=new BufferedReader(fileread);
				
				do
				{
					data=filein.readLine();
					if(data==null)
						break;
					
					System.out.println(data);
				}while(true);
				
				fileread.close();
			}catch (IOException e)
			{
				System.out.println("檔案處理有誤！");
			}
		}
	}
}
