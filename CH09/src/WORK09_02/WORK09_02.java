package WORK09_02;

import java.awt.event.*;
import javax.swing.*;

class CGameF extends JFrame
{
	private int playWin=0,compWin=0,same=0;
	private JLabel lblPlay = new JLabel("請出拳‧‧‧");
	private JLabel lblComp = new JLabel("看誰先贏五次！！");
	private JButton btnScis = new JButton("剪刀");
	private JButton btnStone = new JButton("石頭");
	private JButton btnPaper = new JButton("布");
	private JButton btnRst = new JButton("重來");
	private JLabel lblPlayWin = new JLabel("玩家贏次數：0");
	private JLabel lblCompWin = new JLabel("電腦贏次數：0");
	private JLabel lblSame = new JLabel("平手次數：0");
	private JLabel lblResult = new JLabel("輸贏狀態：");
	ImageIcon iconScis = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Scissor.gif");
	ImageIcon iconStone = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Stone.gif");
	ImageIcon iconPaper = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Paper.gif");
	
	public CGameF()
	{
		setTitle("猜拳遊戲");
		setLayout(null);
		setBounds(500,500,300,325);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblPlay.setBounds(20, 30, 120, 50);
		add(lblPlay);
		
		lblComp.setBounds(160,30,120,50);
		add(lblComp);
		
		btnScis.setBounds(20,100,100,30);
		btnScis.addActionListener(ListenerScis);
		add(btnScis);
		
		btnStone.setBounds(20,145,100,30);
		btnStone.addActionListener(ListenerStone);
		add(btnStone);
		
		btnPaper.setBounds(20,190,100,30);
		btnPaper.addActionListener(ListenerPaper);
		add(btnPaper);
		
		btnRst.setBounds(20,235,100,30);
		btnRst.addActionListener(ListenerRst);
		add(btnRst);
		
		lblPlayWin.setBounds(150,100,120,20);
		add(lblPlayWin);
		
		lblCompWin.setBounds(150,125,120,20);
		add(lblCompWin);
		
		lblSame.setBounds(150,175,120,20);
		add(lblSame);
		
		lblResult.setBounds(150,225,120,20);
		add(lblResult);
		
		repaint();
	}
	
	public ActionListener ListenerScis = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconScis);
			lblPlay.setText("玩家猜剪刀");
			int comp=(int)(Math.random()*3+1);
			if (comp==3)
			{
				compChoose(3);
				playWin += 1;
				lblPlayWin.setText("玩家贏次數："+playWin);
			}
			else if (comp==2)
			{
				compChoose(2);
				compWin += 1;
				lblCompWin.setText("電腦贏次數："+compWin);
			}
			else
			{
				compChoose(1);
				same += 1;
				lblSame.setText("平手次數："+same);
			}
			whichWin();
		}
	};
	
	public ActionListener ListenerStone = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconStone);
			lblPlay.setText("玩家猜石頭");
			int comp=(int)(Math.random()*3+1);
			if (comp==1)
			{
				compChoose(1);
				playWin += 1;
				lblPlayWin.setText("玩家贏次數："+playWin);
			}
			else if (comp==3)
			{
				compChoose(3);
				compWin += 1;
				lblCompWin.setText("電腦贏次數："+compWin);
			}
			else
			{
				compChoose(2);
				same += 1;
				lblSame.setText("平手次數："+same);
			}
			whichWin();
		}
	};
	
	public ActionListener ListenerPaper = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			lblPlay.setIcon(iconPaper);
			lblPlay.setText("玩家猜布");
			int comp=(int)(Math.random()*3+1);
			if (comp==2)
			{
				compChoose(2);
				playWin += 1;
				lblPlayWin.setText("玩家贏次數："+playWin);
			}
			else if (comp==1)
			{
				compChoose(1);
				compWin += 1;
				lblCompWin.setText("電腦贏次數："+compWin);
			}
			else
			{
				compChoose(3);
				same += 1;
				lblSame.setText("平手次數："+same);
			}
			whichWin();
		}
		
	};
	
	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			new CGameF();
		}
	};
	
	public void whichWin()
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
	
	public void compChoose(int x)
	{
		if (x==1)
		{
			lblComp.setIcon(iconScis);
			lblComp.setText("電腦猜剪刀");
		}
		else if (x==2)
		{
			lblComp.setIcon(iconStone);
			lblComp.setText("電腦猜石頭");
		}
		else
		{
			lblComp.setIcon(iconPaper);
			lblComp.setText("電腦猜布");
		}
	}
}

public class WORK09_02
{

	public static void main(String[] args)
	{
		new CGameF();
	}
}
