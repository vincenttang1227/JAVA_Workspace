package HOMEWORK;

import java.awt.event.*;
import javax.swing.*;

class CGameF extends JFrame
{
	private int playWin=0,compWin=0,same=0,compGue;
	private ImageIcon iconScis = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Scissor.gif");
	private ImageIcon iconStone = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Stone.gif");
	private ImageIcon iconPaper = new ImageIcon("..\\HOMEWORK\\src\\HOMEWORK\\images\\Paper.gif");
	private JLabel lblPlay = new JLabel("請出拳‧‧‧");
	private JLabel lblComp = new JLabel("看誰先贏五次！！");
	private JButton btnScis = new JButton("剪刀",iconScis);
	private JButton btnStone = new JButton("石頭",iconStone);
	private JButton btnPaper = new JButton("布",iconPaper);
	private JButton btnRst = new JButton("重來");
	private JLabel lblPlayWin = new JLabel("玩家贏次數：0");
	private JLabel lblCompWin = new JLabel("電腦贏次數：0");
	private JLabel lblSame = new JLabel("平手次數：0");
	private JLabel lblResult = new JLabel("輸贏狀態：");

	CGameF()
	{
		setTitle("猜拳遊戲");
		setLayout(null);
		setBounds(200,100,500,550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblPlay.setBounds(80, 50, 220, 80);
		add(lblPlay);
		
		lblComp.setBounds(280,50,220,80);
		add(lblComp);
		
		btnScis.setBounds(50,150,150,50);
		btnScis.addActionListener(ListenerScis);
		add(btnScis);
		
		btnStone.setBounds(50,230,150,50);
		btnStone.addActionListener(ListenerStone);
		add(btnStone);
		
		btnPaper.setBounds(50,310,150,50);
		btnPaper.addActionListener(ListenerPaper);
		add(btnPaper);
		
		btnRst.setBounds(50,390,150,50);
		btnRst.addActionListener(ListenerRst);
		add(btnRst);
		
		lblPlayWin.setBounds(300,175,120,20);
		add(lblPlayWin);
		
		lblCompWin.setBounds(300,225,120,20);
		add(lblCompWin);
		
		lblSame.setBounds(300,325,230,20);
		add(lblSame);
		
		lblResult.setBounds(300,425,120,20);
		add(lblResult);
		
		repaint();
	}
	
	public ActionListener ListenerScis = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconScis);
			lblPlay.setText("玩家猜剪刀");
			compGue=(int)(Math.random()*3+1);
			if (compGue==3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("電腦猜布");
				playWin += 1;
				lblPlayWin.setText("玩家贏次數："+playWin);
			}
			else if (compGue==2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("電腦猜石頭");
				compWin += 1;
				lblCompWin.setText("電腦贏次數："+compWin);
			}
			else
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("電腦猜剪刀");
				same += 1;
				lblSame.setText("平手次數："+same);
			}
			whoWin();
		}
	};
	
	public ActionListener ListenerStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconStone);
			lblPlay.setText("玩家猜石頭");
			compGue=(int)(Math.random()*3+1);
			if (compGue==1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("電腦猜剪刀");
				playWin += 1;
				lblPlayWin.setText("玩家贏次數："+playWin);
			}
			else if (compGue==3)
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("電腦猜布");
				compWin += 1;
				lblCompWin.setText("電腦贏次數："+compWin);
			}
			else
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("電腦猜石頭");
				same += 1;
				lblSame.setText("平手次數："+same);
			}
			whoWin();
		}
	};
	
	public ActionListener ListenerPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconPaper);
			lblPlay.setText("玩家猜布");
			compGue=(int)(Math.random()*3+1);
			if (compGue==2)
			{
				lblComp.setIcon(iconStone);
				lblComp.setText("電腦猜石頭");
				playWin += 1;
				lblPlayWin.setText("玩家贏次數："+playWin);
			}
			else if (compGue==1)
			{
				lblComp.setIcon(iconScis);
				lblComp.setText("電腦猜剪刀");
				compWin += 1;
				lblCompWin.setText("電腦贏次數："+compWin);
			}
			else
			{
				lblComp.setIcon(iconPaper);
				lblComp.setText("電腦猜布");
				same += 1;
				lblSame.setText("平手次數："+same);
			}
			whoWin();
		}	
	};
	
	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			new CGameF();
		}
	};
	
	public void whoWin()
	{
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
