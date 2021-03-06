package HOMEWORK;

import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;

class CGameF extends JFrame
{
  ImageIcon iconScis = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Scissor.gif");
	ImageIcon iconStone = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Stone.gif");
	ImageIcon iconPaper = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Paper.gif");
	JLabel lblPlay = new JLabel("請出拳•••");
	JLabel lblComp = new JLabel("看誰先贏五次！！");
	JButton btnScis = new JButton("剪刀", iconScis);
	JButton btnStone = new JButton("石頭", iconStone);
	JButton btnPaper = new JButton("布", iconPaper);
	JButton btnRst = new JButton("重來");
	JLabel lblPlayWin = new JLabel("玩家贏次數：0");
	JLabel lblCompWin = new JLabel("電腦贏次數：0");
	JLabel lblSame = new JLabel("平手次數：0");
	JLabel lblResult = new JLabel("輸贏狀態：");
	Font f = new Font("微軟正黑體", Font.BOLD, 16);
	int playWin = 0;
	int compWin = 0;
	int same = 0;

	CGameF()
	{
		setTitle("猜拳遊戲");
		setLayout(null);
		setBounds(200, 100, 500, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblPlay.setBounds(80, 50, 220, 80);
		lblPlay.setFont(f);
		add(lblPlay);

		lblComp.setBounds(280, 50, 220, 80);
		lblComp.setFont(f);
		add(lblComp);

		btnScis.setBounds(50, 150, 150, 50);
		btnScis.addActionListener(ListenerScis);
		add(btnScis);

		btnStone.setBounds(50, 230, 150, 50);
		btnStone.addActionListener(ListenerStone);
		add(btnStone);

		btnPaper.setBounds(50, 310, 150, 50);
		btnPaper.addActionListener(ListenerPaper);
		add(btnPaper);

		btnRst.setBounds(50, 390, 150, 50);
		btnRst.addActionListener(ListenerRst);
		add(btnRst);

		lblPlayWin.setBounds(275, 175, 120, 20);
		lblPlayWin.setFont(f);
		add(lblPlayWin);

		lblCompWin.setBounds(275, 225, 120, 20);
		lblCompWin.setFont(f);
		add(lblCompWin);

		lblSame.setBounds(275, 325, 230, 20);
		lblSame.setFont(f);
		add(lblSame);

		lblResult.setBounds(275, 425, 200, 20);
		lblResult.setFont(f);
		add(lblResult);

		repaint();
	}

	public ActionListener ListenerScis = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconScis);
			lblPlay.setText("玩家猜剪刀");
			checkWin(1);
		}
	};

	public ActionListener ListenerStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconStone);
			lblPlay.setText("玩家猜石頭");
			checkWin(2);
		}
	};

	public ActionListener ListenerPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconPaper);
			lblPlay.setText("玩家猜布");
			checkWin(3);
		}
	};

	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setText("請出拳•••");
			lblPlay.setIcon(new ImageIcon(""));
			lblComp.setText("看誰先贏五次！！");
			lblComp.setIcon(new ImageIcon(""));
			lblPlayWin.setText("玩家贏次數：0");
			lblCompWin.setText("電腦贏次數：0");
			lblSame.setText("平手次數：0");
			lblResult.setText("輸贏狀態：");
			playWin = 0;
			compWin = 0;
			same = 0;

			btnScis.addActionListener(ListenerScis);
			btnStone.addActionListener(ListenerStone);
			btnPaper.addActionListener(ListenerPaper);
			btnRst.addActionListener(ListenerRst);
		}
	};

	public void checkWin(int playGue)
	{
		int compGue = (int) (Math.random() * 3 + 1);
		if (playGue == 1)
		{
			if (compGue == 3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("電腦猜布");
				playWin ++;
				lblPlayWin.setText("玩家贏次數：" + playWin);
				lblResult.setText("輸贏狀態：你猜贏囉！");
			}
			else if (compGue == 2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("電腦猜石頭");
				compWin ++;
				lblCompWin.setText("電腦贏次數：" + compWin);
				lblResult.setText("輸贏狀態：你猜輸囉！");
			}
			else
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("電腦猜剪刀");
				same ++;
				lblSame.setText("平手次數：" + same);
				lblResult.setText("輸贏狀態：這次平手！");
			}
		}

		else if (playGue == 2)
		{
			if (compGue == 1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("電腦猜剪刀");
				playWin ++;
				lblPlayWin.setText("玩家贏次數：" + playWin);
				lblResult.setText("輸贏狀態：你猜贏囉！");
			}
			else if (compGue == 3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("電腦猜布");
				compWin ++;
				lblCompWin.setText("電腦贏次數：" + compWin);
				lblResult.setText("輸贏狀態：你猜輸囉！");
			}
			else
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("電腦猜石頭");
				same ++;
				lblSame.setText("平手次數：" + same);
				lblResult.setText("輸贏狀態：這次平手！");
			}
		}

		else
		{
			if (compGue == 2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("電腦猜石頭");
				playWin ++;
				lblPlayWin.setText("玩家贏次數：" + playWin);
				lblResult.setText("輸贏狀態：你猜贏囉！");
			}
			else if (compGue == 1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("電腦猜剪刀");
				compWin ++;
				lblCompWin.setText("電腦贏次數：" + compWin);
				lblResult.setText("輸贏狀態：你猜輸囉！");
			}
			else
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("電腦猜布");
				same ++;
				lblSame.setText("平手次數：" + same);
				lblResult.setText("輸贏狀態：這次平手！");
			}
		}

		if (playWin == 5)
		{
			btnScis.removeActionListener(ListenerScis);
			btnStone.removeActionListener(ListenerStone);
			btnPaper.removeActionListener(ListenerPaper);
			lblResult.setText("您猜贏了，太棒了！");

		}
		else if (compWin == 5)
		{
			btnScis.removeActionListener(ListenerScis);
			btnStone.removeActionListener(ListenerStone);
			btnPaper.removeActionListener(ListenerPaper);
			lblResult.setText("您猜輸了！");

		}
	}
}

public class HOMEWORK
{
	public static void main(String[] args)
	{
		new CGameF();
	}
}
