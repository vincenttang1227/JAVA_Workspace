package Ch10_DB;

import javax.swing.*;
import java.sql.*;

class CCreateMember
{
	private Connection conn;
	private Statement stmt;
	private String db_name = "member";
	private String db_table = "donation";

	void ErrMsg(String msg, Exception e)
	{
		JOptionPane.showMessageDialog(null, msg + "\n訊息：" + e, "錯誤訊息", JOptionPane.ERROR_MESSAGE);

		System.exit(0);
	}

	public CCreateMember()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (Exception e)
		{
			ErrMsg("1、MSQL驅動程式安裝失敗！", e);
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=12345678");
			stmt = conn.createStatement();
			String Create_DB = "CREATE DATABASE " + db_name;
			stmt.executeUpdate(Create_DB);
		} 
		catch (SQLException e)
		{
			if (stmt != null)
				ErrMsg("2、" + db_name + "資料庫已存在！", e);
			else
				ErrMsg("3、MySQL無法啟動！", e);
		}
		catch (Exception e)
		{
			ErrMsg("4、發生其他錯誤！", e);
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=12345678");
			stmt = conn.createStatement();

			String Create_TB = "CREATE TABLE " + db_table;
			Create_TB += "(id VARCHAR(10) PRIMARY KEY, ";
			Create_TB += "password VARCHAR(10), ";
			Create_TB += "name VARCHAR(10), ";
			Create_TB += "money INT)";
			stmt.executeUpdate(Create_TB);

			JOptionPane.showMessageDialog(null, "5、" + db_name + "資料庫和" + db_table + "資料表建立成功！");

			stmt.close();

			System.exit(0);
		}
		catch (SQLException e)
		{
			if (stmt != null)
				ErrMsg("6、" + db_table + "資料表已存在！", e);
			else
				ErrMsg("7、MySQL無法啟動！", e);
		} 
		catch (Exception e)
		{
			ErrMsg("8、發生其他錯誤！", e);
		}
	}
}

public class CH10_DB1
{
	public static void main(String[] arge)
	{
		new CCreateMember();
	}
}
