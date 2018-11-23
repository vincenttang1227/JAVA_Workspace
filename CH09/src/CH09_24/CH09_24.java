package CH09_24;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyJPanel extends JFrame
{
	MyJPanel()
	{
		setTitle("BorderDemo");
		setLayout(null);
		setBounds(100, 100, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();
		pan.setBounds(150, 20, 100, 107);
		
		Border lineB=BorderFactory.createLineBorder(Color.blue);
		pan.setBorder(BorderFactory.createTitledBorder(lineB,"®Ø¬["));
		
		add(pan);
	}
}

public class CH09_24
{
	public static void main(String[] args)
	{
		new MyJPanel();
	}
}
