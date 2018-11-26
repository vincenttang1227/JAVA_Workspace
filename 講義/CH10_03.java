package CH10_03;

import java.io.*;
import java.sql.*;
import java.text.*;

class CStockOperation
{
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String db_name, db_table;

	public CStockOperation(String db_name, String db_table)
	{
		this.db_name = db_name;
		this.db_table = db_table;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (Exception e)
		{
			System.out.println("1、MSQL驅動程式安裝失敗！\n");
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=12345678");
		}
		catch (SQLException e)
		{
			System.out.println("2、Connection錯誤！\n");
		}
	}

	public void InsertDB(String v_code, String v_name, float v_price, int v_amount)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.execute("INSERT INTO " + db_table + " (code, name, price, amount) VALUES (' " + v_code + " ', ' " + v_name
					+ " ', " + v_price + ", " + v_amount + ")");
		}
		catch (SQLException e)
		{
			System.out.println("3、插入資料錯誤！\n");
		}
		finally
		{
			FileClose();
		}
	}

	public void DeleteDB(String search_code)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM " + db_table + " WHERE code = ' " + search_code + " ' ");
		}
		catch (SQLException e)
		{
			System.out.println("4、刪除資料錯誤！\n");
		}
		finally
		{
			FileClose();
		}
	}

	public void Display()
	{
		float money, total = 0;
		Format nf = new DecimalFormat(",###.0");

		try
		{
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM " + db_table);

			while (rs.next())
			{
				System.out.print(rs.getString("code") + "\t\t" + rs.getString("name") + "\t\t" + rs.getFloat("price")
						+ "\t\t" + rs.getInt("amount"));
				money = rs.getFloat("price") * rs.getInt("amount");
				System.out.println("\t\t" + nf.format(money));
				total += money;
			}
			System.out.println("\n總金額\t\t\t" + nf.format(total));
		}
		catch (SQLException e)
		{
			System.out.println("5、查詢資料錯誤！\n");
		} 
		finally
		{
			FileClose();
		}
	}

	void FileClose()
	{
		if (rs != null)
		{
			try
			{
				rs.close();
			}
			catch (SQLException e)
			{
				System.out.println("6、資料庫關閉錯誤！\n");
			}
			rs = null;
		}

		if (stmt != null)
		{
			try
			{
				stmt.close();
			}
			catch (SQLException e)
			{
				System.out.println("7、資料庫關閉錯誤！\n");
			}
			stmt = null;
		}
	}
}

public class CH10_03
{
	public static void main(String[] args) throws IOException
	{
		String db_name = "mol";
		String db_table = "stock";

		CStockOperation CStOp = new CStockOperation(db_name, db_table);

		BufferedReader keyin;
		keyin= new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.println("=======================================");
			System.out.print("1、新增\t2、全部產品\t3、刪除\t4、結束：");
			int choice = Integer.parseInt(keyin.readLine());
			System.out.println("=======================================");

			switch (choice)
			{
			case 1:
				System.out.println("1、新增產品");
				System.out.print("輸入產品代號：");
				String v_code = keyin.readLine();
				System.out.print("輸入產品名稱：");
				String v_name = keyin.readLine();
				System.out.print("輸入產品單價：");
				float v_price = Float.parseFloat(keyin.readLine());
				System.out.print("輸入產品數量：");
				int v_amount = Integer.parseInt(keyin.readLine());
				CStOp.InsertDB(v_code, v_name, v_price, v_amount);
				break;
			case 2:
				System.out.println("2、全部產品資料");
				System.out.println("\n產品代碼\t產品名稱\t單價\t數量\t金額");
				CStOp.Display();
				break;
			case 3:
				System.out.println("3、刪除產品");
				System.out.print("輸入產品代號：");
				String search_code = keyin.readLine();
				CStOp.DeleteDB(search_code);
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}