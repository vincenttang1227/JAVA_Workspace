package CH09_03;

import java.awt.*;
import javax.swing.*;

public class CH09_03
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JLabel");
		frame.setLayout(null);
		frame.setBounds(100,100,300,150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font f=new Font("標楷體",Font.BOLD,12);
		ImageIcon icon=new ImageIcon("..\\CH09\\src\\CH09_03\\images\\folder.gif");
		
		JLabel lbl1=new JLabel("1、標籤文字");
		lbl1.setFont(f);
		lbl1.setBounds(0,0,80,12);
		frame.add(lbl1);
		
		JLabel lbl2=new JLabel("2、圖示及標籤文字",icon,SwingConstants.RIGHT);
		lbl2.setBounds(20,20,260,30);
		frame.add(lbl2);
		
		frame.repaint();
	}
}