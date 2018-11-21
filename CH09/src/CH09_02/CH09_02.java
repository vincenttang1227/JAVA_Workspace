package CH09_02;

import java.awt.*;
import javax.swing.*;

class CMyFrame extends JFrame
{
	CMyFrame()
	{
		Image img=Toolkit.getDefaultToolkit().getImage("..\\CH09\\src\\CH09_02\\images\\octopus.gif");
		
		setTitle("Swing 視窗程式2");
		setIconImage(img);
		setLocation(550,300);
		setSize(400,200);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CH09_02
{
	public static void main(String[] args)
	{
		JFrame frame1 = new JFrame("Swing 視窗程式1");
		frame1.setVisible(true);
		frame1.setBounds(150, 100, 400, 200);
//		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CMyFrame frame2 = new CMyFrame();
	}
}