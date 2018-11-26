package Ch10_DB;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class CMemberF extends JFrame implements ActionListener
{
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String db_name = "member";
	private String db_table = "donation";
	private JPanel pan = new JPanel();
	private String[] txtBtn = { "新增", "查詢", "更新", "刪除", "結束" };
	private JButton[] btn = new JButton[txtBtn.length];
	private JButton btnOK, btnCancel;
	private JLabel lblId, lblPassword, lblPasswordRepeat, lblName, lblMoney;
	private JTextField txtId, txtName, txtMoney;
	private JPasswordField pwfPassword, pwfPasswordRepeat;
	private int btn_No, money;
	private String id, password, password_repeat, name;
	private boolean is_find, is_check;

	public CMemberF()
	{
		CheckDB();
		CreateObject();

		setTitle("捐款會員系統");
		setLayout(null);
		setBounds(250, 250, 440, 235);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnCancel)
			ShowItem(2);

		if (e.getSource() == btn[0])
		{
			btn_No = 0;
			ShowItem(1);
		}

		if (btn_No == 0 && e.getSource() == btnOK)
			NewData();

		if (e.getSource() == btn[1])
		{
			btn_No = 1;
			InquireData();
		}

		if (e.getSource() == btn[2])
		{
			btn_No = 2;
			UpDataCheck();
		}

		if (btn_No == 2 && e.getSource() == btnOK)
			UpData();

		if (e.getSource() == btn[3])
		{
			btn_No = 3;
			DeleteData();
		}

		if (e.getSource() == btn[4])
			System.exit(0);
	}

	void NewData()
	{
		is_check = true;
		id = txtId.getText().trim();
		password = new String(pwfPassword.getPassword());
		password_repeat = new String(pwfPasswordRepeat.getPassword());
		name = txtName.getText().trim();

		if (id.equals("") || password.equals("") || name.equals(""))
		{
			ErrDataMsg("帳號、密碼或姓名不能空白！");
			is_check = false;
		}

		if (id.length() > 10 || password.length() > 10)
		{
			ErrDataMsg("帳號或密碼最多10個字！");
			is_check = false;
		}

		is_find = IsFindDB(1, id, password, false);

		if (is_find)
		{
			ErrDataMsg("帳號重複！");
			is_check = false;
		}

		if (!(password_repeat.equals(password)))
		{
			ErrDataMsg("密碼錯誤！");
			is_check = false;
		}

		if (name.length() > 10)
		{
			ErrDataMsg("姓名最多10個字");
			is_check = false;
		}

		try
		{
			money = Integer.parseInt(txtMoney.getText());

			if (money <= 0)
			{
				ErrDataMsg("金額不是大於零整數！");
				is_check = false;
			}
		}
		catch (Exception e)
		{
			ErrDataMsg("金額輸入不正確！");
			is_check = false;
		}

		if (is_check == true)
		{
			InsertDB(id, password, name, money);
			BtnTrue();
			ShowItem(2);
		}
	}

	void InquireData()
	{
		id = txtId.getText();
		password = new String(pwfPassword.getPassword());
		is_find = IsFindDB(2, id, password, false);

		if (!is_find)
			ErrDataMsg("帳號或密碼有錯！");
		else
		{
			ShowItem(3);
			try
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT * FROM " + db_table + " WHERE id= ' " + id + " ' ");

				while (rs.next())
				{
					txtName.setText(rs.getString("name"));
					txtMoney.setText(String.valueOf(rs.getInt("Money")));

				}
			}
			catch (SQLException e)
			{
				ErrDBMsg("1、按查詢鈕產生的錯誤", e);
			}
		}
	}

	void UpDataCheck()
	{
		id = txtId.getText();
		password = new String(pwfPassword.getPassword());
		is_find = IsFindDB(2, id, password, false);

		if (!is_find)
			ErrDataMsg("帳號或密碼有錯！");
		else
		{
			ShowItem(4);
			try
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT * FROM " + db_table + " WHERE id= ' " + id + " ' ");

				txtName.setVisible(true);
				txtMoney.setVisible(true);

				while (rs.next())
				{
					txtName.setText(rs.getString("name"));
					txtMoney.setText(String.valueOf(rs.getInt("Money")));
				}
			}
			catch (SQLException e)
			{
				ErrDBMsg("2、按更新鈕產生的錯誤", e);
			}
		}
	}

	void UpData()
	{
		is_check = true;
		name = txtName.getText();

		try
		{
			money = Integer.parseInt(txtMoney.getText());

			if (money <= 0)
			{
				ErrDataMsg("金額不是大於零整數！");
				is_check = false;
			}
		}
		catch (Exception e)
		{
			ErrDataMsg("金額輸入不正確！");
			is_check = false;
		}

		if (is_check == true)
		{
			UpDateDB(id, password, name, money);
			ShowItem(2);
		}
	}

	void DeleteData()
	{
		id = txtId.getText();
		password = new String(pwfPassword.getPassword());
		is_find = IsFindDB(2, id, password, false);

		if (!is_find)
			ErrDataMsg("帳號或密碼有錯！");
		else
		{
			int ans = JOptionPane.showConfirmDialog(null, "確定要刪除帳號：" + id + "嗎？", "再確認", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);

			if (ans == JOptionPane.YES_OPTION)
			{
				DeleteDB(id);
				ShowItem(2);
			}
		}
	}

	void CheckDB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}
		catch (Exception e)
		{
			ErrDBMsg("3、驅動程式安裝失敗！", e);
		}

		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db_name + "?user=root&password=12345678");
		}
		catch (SQLException e)
		{
			ErrDBMsg("4、MySQL無法啟動！", e);
		}
	}

	boolean IsFindDB(int type, String id, String password, boolean is_find)
	{
		try
		{
			stmt = conn.createStatement();

			if (type == 1)
				rs = stmt.executeQuery("SELECT id FROM " + db_table + " WHERE id = ' " + id + " ' ");
			else
				rs = stmt.executeQuery("SELECT id FROM " + db_table + " WHERE id = ' " + id + " 'AND password = ' "
						+ password + " ' ");

			while (rs.next())
				is_find = true;
		}
		catch (SQLException e)
		{
			ErrDBMsg("5、檢查是否有相同帳號產生的錯誤！", e);
		}
		return is_find;
	}

	void InsertDB(String id, String password, String name, int money)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.execute("INSERT " + db_table + "(id,password,name, money) VALUES(' " + id + " ' , ' " + password
					+ " ' , ' " + name + " ' , ' " + money + " ')");
		}
		catch (SQLException e)
		{
			ErrDBMsg("6、插入一個會員資料產生的錯誤！", e);
		}
		finally
		{
			FileClose();
		}
	}

	void UpDateDB(String id, String password, String name, int money)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.executeUpdate("UPDATE " + db_table + " SET name = ' " + name + " ' , money = " + money + " WHERE id =' "
					+ id + " ' ");
		}
		catch (SQLException e)
		{
			ErrDBMsg("7、更新一個會員資料產生的錯誤！", e);
		}
		finally
		{
			FileClose();
		}
	}

	void DeleteDB(String id)
	{
		try
		{
			stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM  " + db_table + " WHERE id =' " + id + " ' ");
		}
		catch (SQLException e)
		{
			ErrDBMsg("8、刪除一個會員資料產生的錯誤！", e);
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
				ErrDBMsg("9、關閉資料庫產生的錯誤！", e);
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
				ErrDBMsg("10、關閉資料庫產生的錯誤！", e);
			}

			stmt = null;
		}
	}

	void BtnTrue()
	{
		for (int i = 0; i < txtBtn.length; i++)
			btn[i].setVisible(true);

		btnOK.setVisible(false);
		btnCancel.setVisible(false);
	}

	void BtnFalse()
	{
		for (int i = 0; i < txtBtn.length; i++)
			btn[i].setVisible(false);

		btnOK.setVisible(true);
		btnCancel.setVisible(true);
		btnCancel.setText("取消");
	}

	void ErrDBMsg(String msg, Exception e)
	{
		JOptionPane.showMessageDialog(null, msg + "\n訊息：" + e, "錯誤訊息", JOptionPane.ERROR_MESSAGE);

		System.exit(0);
	}

	void ErrDataMsg(String msg)
	{
		JOptionPane.showMessageDialog(null, msg, "錯誤訊息", JOptionPane.ERROR_MESSAGE);
	}

	void CreateObject()
	{
		pan.setLayout(null);
		pan.setBounds(0, 0, 432, 160);
		add(pan);

		lblId = new JLabel("帳號：");
		lblId.setBounds(10, 10, 100, 20);
		pan.add(lblId);

		txtId = new JTextField(10);
		txtId.setBounds(90, 10, 90, 20);
		pan.add(txtId);

		lblPassword = new JLabel("密碼：");
		lblPassword.setBounds(10, 40, 100, 20);
		pan.add(lblPassword);

		pwfPassword = new JPasswordField(10);
		pwfPassword.setBounds(90, 40, 90, 20);
		pwfPassword.setEchoChar('*');
		pan.add(pwfPassword);

		lblPasswordRepeat = new JLabel("重複密碼：");
		lblPasswordRepeat.setBounds(10, 70, 100, 20);
		lblPasswordRepeat.setVisible(false);
		pan.add(lblPasswordRepeat);

		pwfPasswordRepeat = new JPasswordField(10);
		pwfPasswordRepeat.setBounds(90, 70, 90, 20);
		pwfPasswordRepeat.setVisible(false);
		pwfPasswordRepeat.setEchoChar('*');
		pan.add(pwfPasswordRepeat);

		lblName = new JLabel("姓名：");
		lblName.setBounds(10, 100, 100, 20);
		lblName.setVisible(false);
		pan.add(lblName);

		txtName = new JTextField(10);
		txtName.setBounds(90, 100, 90, 20);
		txtName.setVisible(false);
		pan.add(txtName);

		lblMoney = new JLabel("月捐金額：");
		lblMoney.setBounds(10, 130, 100, 20);
		lblMoney.setVisible(false);
		pan.add(lblMoney);

		txtMoney = new JTextField();
		txtMoney.setBounds(90, 130, 90, 20);
		txtMoney.setVisible(false);
		pan.add(txtMoney);

		for (int i = 0; i < txtBtn.length; i++)
		{
			btn[i] = new JButton(txtBtn[i]);
			btn[i].setBounds(10 + i * 70, 170, 60, 20);
			add(btn[i]);
			btn[i].addActionListener(this);
		}

		btnOK = new JButton("確定");
		btnOK.setBounds(10, 170, 60, 20);
		btnOK.setVisible(false);
		add(btnOK);
		btnOK.addActionListener(this);

		btnCancel = new JButton("取消");
		btnCancel.setBounds(360, 170, 60, 20);
		btnCancel.setVisible(false);
		add(btnCancel);
		btnCancel.addActionListener(this);
	}

	void ShowItem(int type)
	{
		lblId.setLocation(10, 10);
		lblId.setVisible(true);

		txtId.setLocation(90, 10);
		txtId.setVisible(true);
		txtId.setText("");

		lblPassword.setLocation(10, 40);
		lblPassword.setVisible(true);

		pwfPassword.setLocation(90, 40);
		pwfPassword.setVisible(true);
		pwfPassword.setText("");

		lblPasswordRepeat.setLocation(10, 70);
		lblPasswordRepeat.setVisible(true);

		pwfPasswordRepeat.setLocation(90, 70);
		pwfPasswordRepeat.setVisible(true);
		pwfPasswordRepeat.setText("");

		lblName.setLocation(10, 100);
		lblName.setVisible(true);

		txtName.setLocation(90, 100);
		txtName.setVisible(true);
		txtName.setText("");

		lblMoney.setLocation(10, 130);
		lblMoney.setVisible(true);

		txtMoney.setLocation(90, 130);
		txtMoney.setVisible(true);
		txtMoney.setText("");

		switch (type)
		{
		case 1:
			BtnFalse();
			break;

		case 2:
			BtnTrue();
			lblId.setVisible(true);
			txtId.setVisible(true);
			lblPassword.setVisible(true);
			pwfPassword.setVisible(true);
			lblPasswordRepeat.setVisible(false);
			pwfPasswordRepeat.setVisible(false);
			lblName.setVisible(false);
			txtName.setVisible(false);
			txtName.setEditable(true);
			lblMoney.setVisible(false);
			txtMoney.setVisible(false);
			txtMoney.setEditable(true);
			break;

		case 3:
			BtnFalse();
			btnOK.setVisible(false);
			btnCancel.setText("返回");
			lblId.setVisible(false);
			txtId.setVisible(false);
			lblPassword.setVisible(false);
			pwfPassword.setVisible(false);
			lblPasswordRepeat.setVisible(false);
			pwfPasswordRepeat.setVisible(false);
			lblName.setVisible(true);
			lblName.setLocation(10, 10);
			txtName.setVisible(true);
			txtName.setLocation(90, 10);
			txtName.setEditable(false);
			lblMoney.setVisible(true);
			lblMoney.setLocation(10, 40);
			txtMoney.setVisible(true);
			txtMoney.setLocation(90, 40);
			txtMoney.setEditable(false);
			break;

		case 4:
			BtnFalse();
			lblId.setVisible(false);
			txtId.setVisible(false);
			lblPassword.setVisible(false);
			pwfPassword.setVisible(false);
			lblPasswordRepeat.setVisible(false);
			pwfPasswordRepeat.setVisible(false);
			lblName.setVisible(true);
			lblName.setLocation(10, 10);
			txtName.setVisible(false);
			txtName.setLocation(90, 10);
			txtName.setEditable(true);
			lblMoney.setVisible(true);
			lblMoney.setLocation(10, 40);
			txtMoney.setVisible(true);
			txtMoney.setLocation(90, 40);
			txtMoney.setEditable(true);
			break;
		}
	}
}

public class CH10_DB2
{
	public static void main(String[] args)
	{
		new CMemberF();
	}
}