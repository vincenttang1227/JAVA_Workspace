package CH09_16;

import javax.swing.*;
import java.awt.event.*;

class CKeyMoveF extends JFrame
{
	private JLabel lblMove;
	private int pos_x=70,pos_y=80;
	
	CKeyMoveF()
	{
		setTitle("上下左右鍵 移動圖形");
		setLayout(null);
		setBounds(500,400,260,260);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon1 = new ImageIcon("..\\CH09\\src\\CH09_16\\images\\bomb.gif");
		
		lblMove = new JLabel(icon1);
		lblMove.setBounds(pos_x,pos_y,100,40);
		add(lblMove);
		
		CkeyMove keyMove = new CkeyMove();
		addKeyListener(keyMove);
		
		repaint();
	}
	
	class CkeyMove extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			switch (e.getKeyCode())
			{
			case KeyEvent.VK_UP:
				pos_y -= 2;
				break;
			case KeyEvent.VK_DOWN:
				pos_y += 2;
				break;
			case KeyEvent.VK_LEFT:
				pos_x -= 2;
				break;
			case KeyEvent.VK_RIGHT:
				pos_x += 2;
				break;
			}
			lblMove.setLocation(pos_x,pos_y);
		}
	}
}

public class CH09_16
{
	public static void main(String[]args)
	{
		new CKeyMoveF();
	}
}
