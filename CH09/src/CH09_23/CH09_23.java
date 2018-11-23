package CH09_23;

import java.awt.*;
import javax.swing.*;

class MyJPanel extends JFrame
{
	MyJPanel()
	{
		setTitle("JPanel");
		setLayout(null);
		setBounds(100, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();
		pan.setBounds(150, 20, 100, 107);
		pan.setBackground(Color.yellow);
		pan.setBorder(BorderFactory.createLineBorder(Color.blue));
		add(pan);

		String st[] = { "«ö¶sA", "«ö¶sB", "«ö¶sC" };
		JButton btn[] = new JButton[st.length];
		for (int i = 0; i < st.length; i++)
		{
			btn[i] = new JButton(st[i]);
			pan.add(btn[i]);
		}	
		repaint();
	}
}
public class CH09_23
{
	public static void main(String[] args)
	{
		new MyJPanel();
	}
}
