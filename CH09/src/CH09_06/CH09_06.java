package CH09_06;

import javax.swing.*;

public class CH09_06
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JTextField");
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("..\\CH09\\src\\CH09_06\\images\\Horse.gif");
		
		JButton btn=new JButton("«ö¶s",icon);
		btn.setBounds(5,5,120,40);
		frame.add(btn);

		frame.repaint();
	}
}