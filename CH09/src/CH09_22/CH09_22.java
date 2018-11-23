package CH09_22;

import java.awt.*;
import javax.swing.*;

class MyJFrame extends JFrame
{
	MyJFrame()
	{
		JFrame frame = new JFrame();
		setTitle("GridLayout");
		setLayout(new GridLayout());
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("ヶ턵1");
		add(btn1);
		
		JButton btn2 = new JButton("ヶ턵2");
		add(btn2);
		
		JButton btn3 = new JButton("ヶ턵3");
		add(btn3);
		
		JButton btn4 = new JButton("ヶ턵4");
		add(btn4);
		
		JButton btn5 = new JButton("ヶ턵5");
		add(btn5);

		pack();
	}
}

public class CH09_22
{
	public static void main(String[] args)
	{
		new MyJFrame();
	}
}
