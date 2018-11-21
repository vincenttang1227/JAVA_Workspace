package CH09_08;

import java.awt.event.*;
import javax.swing.*;

class CLoginF extends JFrame
{
	private JTextField txtID, txtShow;
	private JPasswordField pwfPWS;
	private JButton btnOK, btnRST;

	CLoginF()
	{
		JFrame frame = new JFrame("登入");
		frame.setLayout(null);
		frame.setBounds(100, 100, 240, 240);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblTitle = new JLabel("請輸入帳號及密碼");
		lblTitle.setBounds(60, 15, 200, 20);
		frame.add(lblTitle);

		JLabel lblID = new JLabel("帳號：");
		lblID.setBounds(30, 50, 50, 20);
		frame.add(lblID);

		txtID = new JTextField();
		txtID.setBounds(70, 50, 120, 20);
		frame.add(txtID);

		JLabel lblPWS = new JLabel("密碼：");
		lblPWS.setBounds(30, 80, 50, 20);
		frame.add(lblPWS);

		pwfPWS = new JPasswordField();
		pwfPWS.setBounds(70, 80, 120, 20);
		pwfPWS.setEchoChar('*');
		frame.add(pwfPWS);

		txtShow = new JTextField();
		txtShow.setBounds(30, 120, 170, 20);
		txtShow.setEditable(false);
		frame.add(txtShow);

		btnOK = new JButton("確定");
		btnOK.setBounds(45, 160, 60, 20);
		btnOK.addActionListener(Listenerbtn);
		frame.add(btnOK);

		btnRST = new JButton("重來");
		btnRST.setBounds(125, 160, 60, 20);
		btnRST.addActionListener(Listenerbtn);
		frame.add(btnRST);

		frame.repaint();
	}

	public ActionListener Listenerbtn = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == btnRST)
			{
				txtID.setText("");
				pwfPWS.setText("");
				txtShow.setText("");
			}

			if (e.getSource() == btnOK)
			{
				String pws = new String(pwfPWS.getPassword());

				if (txtID.getText().equals("MOL") && pws.equals("20170918"))
					txtShow.setText("正確，歡迎光臨");
				else
					txtShow.setText("錯誤，請重新輸入");
			}
		}
	};
}

public class CH09_08
{
	public static void main(String[] args)
	{
		CLoginF loginF = new CLoginF();
	}
}