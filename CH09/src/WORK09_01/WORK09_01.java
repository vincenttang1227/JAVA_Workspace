package WORK09_01;

import java.awt.*;
import javax.swing.*;

public class WORK09_01
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("登入");
		frame.setLayout(null);
		frame.setBounds(100,100,240,240);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font f=new Font("微軟正黑體",Font.BOLD,12);
		
		JLabel lbl1=new JLabel("請輸入帳號及密碼");
		lbl1.setFont(f);
		lbl1.setBounds(65,20,100,20);
		frame.add(lbl1);
		
		JLabel lbl2=new JLabel("帳號：");
		lbl2.setFont(f);
		lbl2.setBounds(30,50,100,20);
		frame.add(lbl2);
		
		JLabel lbl3=new JLabel("密碼：");
		lbl3.setFont(f);
		lbl3.setBounds(30,80,100,20);
		frame.add(lbl3);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(75, 50, 120, 20);
		txt1.setEditable(true);
		frame.add(txt1);
		
		JPasswordField pws = new JPasswordField("");
		pws.setBounds(75, 80, 120, 20);
		pws.setEchoChar('*');
		frame.add(pws);
		
		JTextField txt2 = new JTextField();
		txt2.setBounds(30, 115, 170, 20);
		txt2.setEditable(false);
		frame.add(txt2);
		
		JButton btn1=new JButton("確定");
		btn1.setBounds(40,150,70,25);
		frame.add(btn1);
		
		JButton btn2=new JButton("重來");
		btn2.setBounds(120,150,70,25);
		frame.add(btn2);
		
		
		frame.repaint();
	}
}