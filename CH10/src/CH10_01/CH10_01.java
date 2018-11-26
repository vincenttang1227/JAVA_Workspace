package CH10_01;

public class CH10_01
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL Driver安裝成功！");
		}
		catch (Exception e)
		{
			System.out.println("MySQL Driver安裝失敗！!");
		}
	}
}