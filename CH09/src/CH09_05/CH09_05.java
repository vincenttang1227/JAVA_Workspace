package CH09_05;

import javax.swing.*;

public class CH09_05
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JTextField");
		frame.setLayout(null);
		frame.setBounds(100, 100, 300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPasswordField pws = new JPasswordField("PASSWORD");
		pws.setBounds(5, 5, 120, 20);
		pws.setEchoChar('*');
		frame.add(pws);

		frame.repaint();
	}
}