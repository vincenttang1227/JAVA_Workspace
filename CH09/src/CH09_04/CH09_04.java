package CH09_04;

import javax.swing.*;

public class CH09_04
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JTextField");
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField txt = new JTextField("單行文字欄位");
		txt.setBounds(5, 5, 120, 20);
		txt.setEditable(false);
		frame.add(txt);

		frame.repaint();
	}
}