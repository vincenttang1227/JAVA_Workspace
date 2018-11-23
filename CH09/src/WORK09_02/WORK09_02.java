package WORK09_02;

import java.awt.event.*;
import javax.swing.*;

class CGameF extends JFrame
{
	private int playWin=0,compWin=0,same=0,compGue;
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

	public CGameF()
	{
		setTitle("猜拳遊戲");
		setLayout(null);
		setBounds(250,250,300,325);
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
	
	ImageIcon iconScis = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Scissor.gif");
	ImageIcon iconStone = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Stone.gif");
	ImageIcon iconPaper = new ImageIcon("..\\CH09\\src\\WORK09_02\\images\\Paper.gif");
	
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
	};
	
	public ActionListener ListenerRst = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			new CGameF();
		}
	};
}

public class WORK09_02
{

	public static void main(String[] args)
	{
		new CGameF();
	}
}
