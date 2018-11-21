package CH09_10;

import java.awt.event.*;
import javax.swing.*;

class CAreaF extends JFrame implements ActionListener
{
	private JTextField txtLen = new JTextField("0");
	private JTextField txtArea = new JTextField();
	private JButton btnOK=new JButton("確定");
	private JButton btnCls=new JButton("清除");

	CAreaF()
	{
		setTitle("正方型面積");
		setLayout(null);
		setBounds(100,100,220,180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblTitle = new JLabel("正方形面積 = L * L");
		lblTitle.setBounds(50,10,200,20);
		add(lblTitle);

		JLabel lblLen = new JLabel("輸入邊長：");
		lblLen.setBounds(20,50,100,20);
		add(lblLen);

		txtLen.setBounds(90, 50, 100, 20);
		add(txtLen);

		txtArea.setBounds(20,80,170,20);
		txtArea.setEditable(false);
		add(txtArea);

		btnOK.setBounds(20,110,70,20);
		btnOK.addActionListener(this);
		add(btnOK);

		btnCls.setBounds(120,110,70,20);
		add(btnCls);

		repaint();
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnOK)
		{
			int len,area;
			len=Integer.parseInt(txtLen.getText());
			area=len*len;
			txtArea.setText("面積："+area);
			btnOK.removeActionListener(this);
			btnCls.addActionListener(this);
		}

		if (e.getSource() == btnCls)
		{
			txtLen.setText("0");
			txtArea.setText("");
			btnOK.addActionListener(this);
			btnCls.removeActionListener(this);
		}
	}
}

public class CH09_10
{
	public static void main(String[] args)
	{
		new CAreaF();
	}
}