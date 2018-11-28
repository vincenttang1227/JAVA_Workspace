package WORK09_02;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;

class RPSF extends JFrame
{
	private JLabel lblp, lblc, cWin, pWin, push, status, lbl6, lblpWin, lblcWin, lblPush;
	private JButton btnScissor, btnStone, btnPaper, btnReset;
	private int cCount = 0, pCount = 0, pushCount = 0;
	private ImageIcon Scissor, Stone, Paper;

	public RPSF()
	{
		setTitle("猜拳遊戲");
		setLayout(null);
		setBounds(500, 100, 600, 680);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font f = new Font("新細明體", Font.BOLD, 20);

		Scissor = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Scissor.gif");
		Stone = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Stone.gif");
		Paper = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Paper.gif");

		JLabel lblp = new JLabel("請出拳~~");
		lblp.setFont(f);
		lblp.setBounds(50, 80, 200, 80);
		add(lblp);

		JLabel lblc = new JLabel("看誰先贏五次!!");
		lblc.setFont(f);
		lblc.setBounds(300, 80, 200, 80);
		add(lblc);

		JLabel pWin = new JLabel("玩家贏次數：");
		pWin.setFont(f);
		pWin.setBounds(280, 205, 150, 80);
		add(pWin);

		JLabel lblpWin = new JLabel("" + pCount);
		lblpWin.setFont(f);
		lblpWin.setBounds(430, 205, 150, 80);
		add(lblpWin);

		JLabel cWin = new JLabel("電腦贏次數：");
		cWin.setFont(f);
		cWin.setBounds(280, 305, 150, 80);
		add(cWin);

		JLabel lblcWin = new JLabel("" + cCount);
		lblcWin.setFont(f);
		lblcWin.setBounds(430, 305, 150, 80);
		add(lblcWin);

		JLabel push = new JLabel("平手次數：");
		push.setFont(f);
		push.setBounds(280, 405, 150, 80);
		add(push);

		JLabel lblpush = new JLabel("" + pushCount);
		lblpush.setFont(f);
		lblpush.setBounds(430, 405, 150, 80);
		add(lblpush);

		JLabel lbl6 = new JLabel("輸贏狀態：");
		lbl6.setFont(f);
		lbl6.setBounds(280, 505, 150, 80);
		add(lbl6);

		JLabel status = new JLabel();
		status.setFont(f);
		status.setBounds(400, 505, 150, 80);
		add(status);

		btnScissor = new JButton(" 剪刀 ", Scissor);
		btnScissor.setFont(f);
		btnScissor.setBounds(50, 200, 170, 80);
		add(btnScissor);
		btnScissor.addActionListener(ListenerbtnScissor);

		btnStone = new JButton(" 石頭 ", Stone);
		btnStone.setFont(f);
		btnStone.setBounds(50, 300, 170, 80);
		add(btnStone);
		btnStone.addActionListener(ListenerbtnStone);

		btnPaper = new JButton(" 布 ", Paper);
		btnPaper.setFont(f);
		btnPaper.setBounds(50, 400, 170, 80);
		add(btnPaper);
		btnPaper.addActionListener(ListenerbtnPaper);

		btnReset = new JButton("重玩");
		btnReset.setFont(f);
		btnReset.setBounds(50, 500, 170, 80);
		add(btnReset);
		btnReset.addActionListener(ListenerbtnReset);

		repaint();
	}

	public void check()
	{
		int num = (int) (Math.random() * 3) + 1;
		if (num == 1)
		{
			lblc.setIcon(Scissor);
			lblc.setText("電腦出剪刀");
			status.setText("平手!");
			pushCount += 1;
			push.setText("" + pushCount);
		}
		else if (num == 2)
		{
			lblc.setIcon(Stone);
			lblc.setText("電腦出石頭");
			status.setText("電腦贏了!");
			cCount += 1;
			lblcWin.setText("" + cCount);
		}
		else
		{
			lblc.setIcon(Paper);
			lblc.setText("電腦出布");
			status.setText("你贏了!");
			pCount += 1;
			lblpWin.setText("" + pCount);
		}
		if (pCount >= 5)
		{
			status.setText("你贏了");
			btnScissor.removeActionListener(ListenerbtnScissor);
			btnStone.removeActionListener(ListenerbtnStone);
			btnPaper.removeActionListener(ListenerbtnPaper);
		}
		if (cCount >= 5)
		{
			status.setText("電腦贏了");
			btnScissor.removeActionListener(ListenerbtnScissor);
			btnStone.removeActionListener(ListenerbtnStone);
			btnPaper.removeActionListener(ListenerbtnPaper);
		}
	}

	public ActionListener ListenerbtnReset = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			pCount = 0;
			cCount = 0;
			pushCount = 0;

			lblpWin.setText("" + pCount);
			lblcWin.setText("" + cCount);
			lblPush.setText("" + pushCount);
			status.setText("");

			btnScissor.addActionListener(ListenerbtnScissor);
			btnStone.addActionListener(ListenerbtnStone);
			btnPaper.addActionListener(ListenerbtnPaper);
		}
	};
	public ActionListener ListenerbtnScissor = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblp.setText("玩家出剪刀");
			lblp.setIcon(new ImageIcon("..\\CH09\\src\\HOME_WORK_05\\images\\Scissor.gif"));
			check();
		}
	};
	public ActionListener ListenerbtnStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblp.setText("玩家出石頭");
			lblp.setIcon(new ImageIcon("..\\CH09\\src\\HOME_WORK_05\\images\\Stone.gif"));
			check();
		}
	};
	public ActionListener ListenerbtnPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblp.setText("玩家出布");
			lblp.setIcon(new ImageIcon("..\\CH09\\src\\HOME_WORK_05\\images\\Paper.gif"));
			check();
		}
	};
}

public class WORK09_02
{
	public static void main(String[] args)
	{
		new RPSF();
	}
}
