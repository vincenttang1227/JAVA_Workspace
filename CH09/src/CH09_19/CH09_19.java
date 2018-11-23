package CH09_19;

import java.awt.event.*;
import javax.swing.*;

class CMouseListF extends JFrame implements MouseListener, MouseMotionListener
{
	private JLabel lblPic;
	private int pos_x = 100, pos_y = 50, x1, x2, y1, y2;
	private boolean is_drag = false;

	CMouseListF()
	{
		setTitle("Åã¥Ü·Æ¹«ªº©ì¦²");
		setLayout(null);
		setBounds(500, 400, 260, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblPic = new JLabel(new ImageIcon("..\\CH09\\src\\CH09_19\\images\\Scissor.gif"));
		lblPic.setBounds(pos_x,pos_y,50,50);
		add(lblPic);
		lblPic.addMouseListener(this);
		lblPic.addMouseMotionListener(this);

		repaint();
	}

	public void mousePressed(MouseEvent e)
	{
		if (is_drag)
			return;

		if (e.getButton() == 1)
			is_drag = true;

		x1 = e.getX();
		y1 = e.getY();
	}

	public void mouseReleased(MouseEvent e)
	{
		if (!is_drag)
			return;

		is_drag = false;
	}

	public void mouseDragged(MouseEvent e)
	{
		if (!is_drag)
			return;

		x2 = e.getX();
		y2 = e.getY();

		pos_x = pos_x + (x2 - x1);
		pos_y = pos_y + (y2 - y1);

		if (pos_x <= 0)
			pos_x = 0;

		if (pos_x >= 184)
			pos_x = 0;

		if (pos_y <= 0)
			pos_y = 0;

		if (pos_y >= 92)
			pos_y = 92;

		lblPic.setLocation(pos_x, pos_y);
	}

	public void mouseClicked(MouseEvent e)
	{
	}

	public void mouseEntered(MouseEvent e)
	{
	}

	public void mouseExited(MouseEvent e)
	{
	}

	public void mouseMoved(MouseEvent e)
	{
	}
}

public class CH09_19
{
	public static void main(String[] args)
	{
		CMouseListF mouseF = new CMouseListF();
	}
}
