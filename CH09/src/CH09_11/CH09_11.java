package CH09_11;

import java.awt.event.*;
import javax.swing.*;

class CAreaF extends JFrame
{
	private JTextField txtLen, txtArea;
	private JButton btnOK, btnCls;

	CAreaF()
	{
		setTitle("正方型面積");
		setLayout(null);
		setBounds(100, 100, 220, 180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblTitle = new JLabel("正方形面積 = L * L");
		lblTitle.setBounds(50, 10, 200, 20);
		add(lblTitle);

		JLabel lblLen = new JLabel("輸入邊長：");
		lblLen.setBounds(20, 50, 100, 20);
		add(lblLen);

		txtLen = new JTextField("0");
		txtLen.setBounds(90, 50, 100, 20);
		add(txtLen);

		txtArea = new JTextField();
		txtArea.setBounds(20, 80, 170, 20);
		txtArea.setEditable(false);
		add(txtArea);

		btnOK = new JButton("確定");
		btnOK.setBounds(20, 110, 70, 20);
		btnOK.addActionListener(ListenerOK);
		add(btnOK);

		btnCls = new JButton("清除");
		btnCls.setBounds(120, 110, 70, 20);
		add(btnCls);

		repaint();
	}

	public ActionListener ListenerOK = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int len, area;
			len = Integer.parseInt(txtLen.getText());
			area = len * len;
			txtArea.setText("面積：" + area);
			btnOK.removeActionListener(ListenerOK);
			btnCls.addActionListener(ListenerCls);
		}
	};

	public ActionListener ListenerCls = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			txtLen.setText("0");
			txtArea.setText("");
			btnOK.addActionListener(ListenerOK);
			btnCls.removeActionListener(ListenerCls);
		}
	};
}

public class CH09_11
{
	public static void main(String[] args)
	{
		CAreaF areaF = new CAreaF();
	}
}